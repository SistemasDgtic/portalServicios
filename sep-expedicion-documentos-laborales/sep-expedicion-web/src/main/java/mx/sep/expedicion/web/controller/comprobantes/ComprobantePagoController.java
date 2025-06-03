/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.sep.expedicion.web.controller.comprobantes;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import mx.sep.expedicion.modelo.Tps003Comprobante;
import mx.sep.expedicion.servicios.comprobantes.ComprobantePagoService;
import mx.sep.util.datos.vo.FiltroBusquedaVO;
import mx.sep.util.web.ControllerBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author eduardo.hernandez
 */
@Controller
@RequestMapping(value = "/comprobantes/pago")
public class ComprobantePagoController extends ControllerBase {

    @Autowired
    private ComprobantePagoService comprobantePagoService;

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public List<Tps003Comprobante> buscaPaginaRest(@RequestHeader("Range") String rango,
            HttpServletResponse response,
            HttpServletRequest request) throws Exception {
        String anio = (request.getParameter("anio") == null || "".equals(new String(request.getParameter("anio").getBytes("ISO-8859-1"),"UTF-8")) ? null:"" + new String(request.getParameter("anio").getBytes("ISO-8859-1"),"UTF-8"));
        String quincena = ( request.getParameter("quincena") == null || "".equals( request.getParameter("quincena") )? null : "" + request.getParameter("quincena") );
        String rfc = (request.getParameter("rfc") == null || "".equals(new String(request.getParameter("rfc").getBytes("ISO-8859-1"),"UTF-8")) ? null:"" + new String(request.getParameter("rfc").getBytes("ISO-8859-1"),"UTF-8"));
        Tps003Comprobante tps003Comprobante = new Tps003Comprobante();
        tps003Comprobante.setRfc(rfc);
        Integer total = comprobantePagoService.consultaContar(tps003Comprobante, anio, quincena);
        FiltroBusquedaVO filtroBusquedaVO = this.manejarRestPaging(rango, total, request, response);
        List<Tps003Comprobante> lstTps003 = null;
        lstTps003 = comprobantePagoService.consultaPagina(filtroBusquedaVO, tps003Comprobante, anio, quincena);
        return lstTps003;
    }

    @RequestMapping(value = "/guardar", method = RequestMethod.POST)
    @ResponseBody
    public void guardarFormulario(@RequestBody Tps003Comprobante tps003Comprobante) throws Exception {
        comprobantePagoService.guardar(tps003Comprobante);
    }

    @RequestMapping(value = "/modificar", method = RequestMethod.POST)
    @ResponseBody
    public void modificarFormulario(@RequestBody Tps003Comprobante tps003Comprobante) throws Exception {
        comprobantePagoService.modificar(tps003Comprobante);
    }

    @RequestMapping(value = "/eliminar", method = RequestMethod.POST)
    @ResponseBody
    public void eliminarFormulario(@RequestBody Tps003Comprobante tps003Comprobante) throws Exception {
        comprobantePagoService.eliminar(tps003Comprobante);
    }

    @RequestMapping(value = "/todos", method = RequestMethod.GET)
    @ResponseBody
    public List<Tps003Comprobante> consultaTodos() throws Exception {
        List<Tps003Comprobante> lstTps003 = comprobantePagoService.consultaTodos();
        return lstTps003;
    }
}
