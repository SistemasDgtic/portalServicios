/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.sep.expedicion.web.controller.constancias;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import mx.sep.expedicion.modelo.Tps015IsrAnual;
import mx.sep.expedicion.servicios.constancias.ConstanciaIsrAnualService;
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
 * @author ana.perezh
 */
@Controller
@RequestMapping(value = "/constancias/form37")
public class ConstanciaIsrAnualController extends ControllerBase {

    @Autowired
    private ConstanciaIsrAnualService constanciaIsrAnualService;

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public List<Tps015IsrAnual> buscaPaginaRest(@RequestHeader("Range") String rango,
            HttpServletResponse response,
            HttpServletRequest request) throws Exception {
        Short anio = (request.getParameter("anio") == null || "".equals(request.getParameter("anio")) ? new Short("0") : new Short("" + request.getParameter("anio")));
        String rfc = (request.getParameter("rfc") == null || "".equals(new String(request.getParameter("rfc").getBytes("ISO-8859-1"), "UTF-8")) ? null : "" + new String(request.getParameter("rfc").getBytes("ISO-8859-1"), "UTF-8"));
        Tps015IsrAnual tps015IsrAnual = new Tps015IsrAnual();
        tps015IsrAnual.setRfc(rfc);
        tps015IsrAnual.setAnio(anio);
        Integer total = constanciaIsrAnualService.consultaContar(tps015IsrAnual);
        FiltroBusquedaVO filtroBusquedaVO = this.manejarRestPaging(rango, total, request, response);
        List<Tps015IsrAnual> lstTps015 = null;
        lstTps015 = constanciaIsrAnualService.consultaPagina(filtroBusquedaVO, tps015IsrAnual);
        return lstTps015;
    }

    @RequestMapping(value = "/guardar", method = RequestMethod.POST)
    @ResponseBody
    public void guardarFormulario(@RequestBody Tps015IsrAnual tps015IsrAnual) throws Exception {
        constanciaIsrAnualService.guardar(tps015IsrAnual);
    }

    @RequestMapping(value = "/modificar", method = RequestMethod.POST)
    @ResponseBody
    public void modificarFormulario(@RequestBody Tps015IsrAnual tps015IsrAnual) throws Exception {
        constanciaIsrAnualService.modificar(tps015IsrAnual);
    }

    @RequestMapping(value = "/eliminar", method = RequestMethod.POST)
    @ResponseBody
    public void eliminarFormulario(@RequestBody Tps015IsrAnual tps015IsrAnual) throws Exception {
        constanciaIsrAnualService.eliminar(tps015IsrAnual);
    }

    @RequestMapping(value = "/todos", method = RequestMethod.GET)
    @ResponseBody
    public List<Tps015IsrAnual> consultaTodos() throws Exception {
        List<Tps015IsrAnual> lstTps015 = constanciaIsrAnualService.consultaTodos();
        return lstTps015;
    }

}
