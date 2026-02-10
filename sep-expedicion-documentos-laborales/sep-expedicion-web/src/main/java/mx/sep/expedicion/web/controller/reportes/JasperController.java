package mx.sep.expedicion.web.controller.reportes;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;
import mx.sep.expedicion.modelo.Tps003Comprobante;
import mx.sep.expedicion.modelo.Tps013TimbraSat;
import mx.sep.expedicion.modelo.Tps014RfcEmisor;
import mx.sep.expedicion.modelo.Tps017Retenedor;
import mx.sep.expedicion.modelo.Tps021QnasAguinaldo;
import mx.sep.expedicion.servicios.comprobantes.ComprobantePagoService;
import mx.sep.expedicion.servicios.comprobantes.TimbradoSatService;
import mx.sep.expedicion.servicios.comprobantes.Tps021QnasAguinaldoService;
import mx.sep.expedicion.servicios.constancias.RetenedorService;
import mx.sep.seguridad.modelo.UsuarioSeguridad;
import mx.sep.seguridad.util.SeguridadUtil;
import mx.sep.util.servicios.LoggerUtil;
import mx.sep.util.web.QRGenerator;
import net.sf.jasperreports.engine.JRParameter;
import net.sf.jasperreports.engine.fill.JRFileVirtualizer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author jose.hernandezb
 */
@Controller
@RequestMapping("/jasper")
public class JasperController {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Autowired
    private TimbradoSatService timbradoSatService;
    @Autowired
    private ComprobantePagoService comprobantePagoService;
    @Autowired
    private RetenedorService retenedorService;
    @Autowired
    private Tps021QnasAguinaldoService tps021QnasAguinaldoService;

    @RequestMapping(value = "/repReciboPago/{token}", method = RequestMethod.GET)
    public ModelAndView repReciboPago(@RequestParam(value = "nuComprobante", required = true) Integer nuComprobante,
            @RequestParam(value = "qnaProc", required = true) Integer qnaProc,
            @RequestParam(value = "consQnaProc", required = true) Integer consQnaProc,
            HttpServletRequest request, HttpServletResponse response, @PathVariable String token) throws Exception {
        Map modelMap = new HashMap();
        DataSource dataSource = jdbcTemplate.getDataSource();
        String rutaSer = request.getSession().getServletContext()
                .getRealPath("/");
        Tps013TimbraSat tps013TimbraSat = new Tps013TimbraSat();
        QRGenerator qr = new QRGenerator();
        Integer compTimExist = timbradoSatService.comprobanteTimbradoExist(nuComprobante);
        if (compTimExist != 0) {
            tps013TimbraSat = timbradoSatService.consultaPorComprobante(nuComprobante);
            Tps003Comprobante tps003Comprobante = new Tps003Comprobante();
            tps003Comprobante = comprobantePagoService.consultaPorComprobante(nuComprobante);
            List<Tps014RfcEmisor> lstTps014 = null;
            lstTps014 = timbradoSatService.consultaRFCEmisor(qnaProc);
            String rfcEmisor = lstTps014.get(0).getRfcEmisor();
            DecimalFormat df = new DecimalFormat("0000000000.000000");
            String totalCompFormat = df.format(tps003Comprobante.getTotNetoCheque()).toString();
            String data = "?re=" + rfcEmisor + "&rr=" + tps003Comprobante.getRfc() + "&tt=" + totalCompFormat + "&id=" + tps013TimbraSat.getUuid();
            //Generación del código QR            
            qr.QRGeneratorData(data, rutaSer, nuComprobante);
        }
        UsuarioSeguridad us = SeguridadUtil.getUsuarioActual();
        LoggerUtil.debug(this, "Usuario ------------>>>>: " + us.getUsername());
        String nombreRol = SeguridadUtil.getUnicoRol();
        LoggerUtil.debug(this, "Rol ------------>>>>: " + nombreRol);
        if (!(nombreRol.equals("ROLE_ADMINISTRADOR") || nombreRol.equals("ROLE_APOYO"))) {
           modelMap.put("pRfc", "AND comp.rfc = '"+us.getUsername()+"'");
        }else{
           modelMap.put("pRfc"," ");
        }
        //Parámetros para generación del reporte        
        modelMap.put("dataSourceKey", dataSource);
        modelMap.put("PATH_JASPER", rutaSer + "WEB-INF/classes/");
        modelMap.put("PATH_WEB", rutaSer);
        modelMap.put("pIdComprobante", nuComprobante);
        modelMap.put("pCompTimExist", compTimExist);
        JRFileVirtualizer virtualizer = new JRFileVirtualizer(1, System.getProperty("java.io.tmpdir"));
        modelMap.put(JRParameter.REPORT_VIRTUALIZER, virtualizer);

        Tps021QnasAguinaldo tps021QnasAguinaldo = new Tps021QnasAguinaldo();
        tps021QnasAguinaldo.setQnaProc(qnaProc);
        tps021QnasAguinaldo.setConsQnaProc(consQnaProc.shortValue());
        Integer total = tps021QnasAguinaldoService.consultaContar(tps021QnasAguinaldo);
        System.out.println("TOTAL RECUPERADO " + total);
        ModelAndView modelAndView;
        if (total == 0) {
            modelAndView = new ModelAndView("repComprobantePago", modelMap);
        } else {
            modelAndView = new ModelAndView("repComprobantePagoCpto24", modelMap);
        }
        Cookie cookie = new Cookie("downloadRepReciboPago", token);
        cookie.setPath("/");
        response.addCookie(cookie);
        return modelAndView;
    }

    @RequestMapping(value = "/repConstanciaForm37", method = RequestMethod.GET)
    public ModelAndView repConstanciaForm37(@RequestParam(value = "idConstancia", required = true) Integer idConstancia,
            @RequestParam(value = "anio", required = true) Integer anio,
            @RequestParam(value = "token", required = true) String token,
            HttpServletRequest request, HttpServletResponse response) throws Exception {
        Map modelMap = new HashMap();
        DataSource dataSource = jdbcTemplate.getDataSource();
        String rutaSer = request.getSession().getServletContext()
                .getRealPath("/");
        List<Tps017Retenedor> lstTps017 = retenedorService.consultaPorAnio(anio);
        //Parámetros para generación del reporte       
        InputStream isFirmaDig = new ByteArrayInputStream(lstTps017.get(0).getFirmaDigital());
        InputStream isSelloDig = new ByteArrayInputStream(lstTps017.get(0).getSelloRetenedor());
        modelMap.put("dataSourceKey", dataSource);
        modelMap.put("PATH_JASPER", rutaSer + "WEB-INF/classes/");
        modelMap.put("PATH_WEB", rutaSer);
        modelMap.put("pIdConstancia", idConstancia);
        modelMap.put("pFirmaDigital", isFirmaDig);
        modelMap.put("pSelloDigital", isSelloDig);
        modelMap.put("pRFCRetenedor", lstTps017.get(0).getRfc());
        modelMap.put("pRazonSocial", lstTps017.get(0).getRazonSocial());
        modelMap.put("pCURPRepresentante", lstTps017.get(0).getCveUnica());
        modelMap.put("pNombreRepresentante", lstTps017.get(0).getNomRepresentante());
        JRFileVirtualizer virtualizer = new JRFileVirtualizer(1, System.getProperty("java.io.tmpdir"));
        modelMap.put(JRParameter.REPORT_VIRTUALIZER, virtualizer);
        ModelAndView modelAndView = new ModelAndView("repFormulario37", modelMap);
        Cookie cookie = new Cookie("downloadForm37", token);
        cookie.setPath("/");
        response.addCookie(cookie);
        return modelAndView;
    }

    @RequestMapping(value = "/eliminaQR/{random}", method = RequestMethod.GET)
    public void eliminaQR(HttpServletRequest request, HttpServletResponse response, @PathVariable Integer random) throws Exception {
        QRGenerator qr = new QRGenerator();
        String rutaSer = request.getSession().getServletContext().getRealPath("/");
        qr.deleteFile(rutaSer, random);
    }

    @RequestMapping(value = "/repResumen", method = RequestMethod.GET)
    public ModelAndView repResumen(@RequestParam(value = "username", required = true) String username,
            @RequestParam(value = "anio", required = true) Integer anio,
            @RequestParam(value = "token", required = true) String token,
            HttpServletRequest request, HttpServletResponse response) throws Exception {

        Map modelMap = new HashMap();
        DataSource dataSource = jdbcTemplate.getDataSource();
        String rutaSer = request.getSession().getServletContext()
                .getRealPath("/");
        //Parámetros para generación del reporte       

        modelMap.put("dataSourceKey", dataSource);
        modelMap.put("PATH_WEB", rutaSer);
        modelMap.put("pRfc", username);
        modelMap.put("pAnio", anio);
        JRFileVirtualizer virtualizer = new JRFileVirtualizer(1, System.getProperty("java.io.tmpdir"));
        modelMap.put(JRParameter.REPORT_VIRTUALIZER, virtualizer);
        ModelAndView modelAndView = new ModelAndView("repResumen", modelMap);
        Cookie cookie = new Cookie("downloadResumen", token);
        cookie.setPath("/");
        response.addCookie(cookie);
        return modelAndView;
    }

    @RequestMapping(value = "/repReporteAnualIng", method = RequestMethod.GET)
    public ModelAndView reprepReporteAnualIng(@RequestParam(value = "username", required = true) String username,
            @RequestParam(value = "anio", required = true) Integer anio,
            @RequestParam(value = "token", required = true) String token,
            HttpServletRequest request, HttpServletResponse response) throws Exception {

        Map modelMap = new HashMap();
        DataSource dataSource = jdbcTemplate.getDataSource();
        String rutaSer = request.getSession().getServletContext()
                .getRealPath("/");
        //Parámetros para generación del reporte       

        modelMap.put("dataSourceKey", dataSource);
        modelMap.put("PATH_WEB", rutaSer);
        modelMap.put("pRfc", username);
        modelMap.put("pAnio", anio);
        JRFileVirtualizer virtualizer = new JRFileVirtualizer(1, System.getProperty("java.io.tmpdir"));
        modelMap.put(JRParameter.REPORT_VIRTUALIZER, virtualizer);
        ModelAndView modelAndView = new ModelAndView("repReporteAnualIng", modelMap);
        Cookie cookie = new Cookie("downloadReporteAnual", token);
        cookie.setPath("/");
        response.addCookie(cookie);
        return modelAndView;
    }

}
