/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mx.sep.expedicion.web.controller.configuracion;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import mx.sep.expedicion.modelo.Tps011Quincenas;
import mx.sep.expedicion.servicios.configuracion.QuincenasService;
import mx.sep.util.datos.vo.FiltroBusquedaVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Elisa Pérez
 */
@Controller
@RequestMapping(value = "/configuracion/quincenas")
public class QuincenasController extends ConfiguracionBaseController<Tps011Quincenas> {
    
    @Autowired
    private QuincenasService quincenasService;
    
    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public List<Tps011Quincenas> buscaPaginaRest(@RequestHeader("Range") String rango,
            HttpServletResponse response,
            HttpServletRequest request) throws Exception {
        String anio = (request.getParameter("anio") == null || "".equals(request.getParameter("anio")) ? null: request.getParameter("anio"));
        String quincena = ( request.getParameter("quincena") == null || "".equals( request.getParameter("quincena") )? null : request.getParameter("quincena") );
        Tps011Quincenas tps011Quincenas = new Tps011Quincenas();        
        Integer total = quincenasService.consultaContar(tps011Quincenas, anio, quincena);
        System.out.println("total: " + total);
        FiltroBusquedaVO filtroBusquedaVO = this.manejarRestPaging(rango, total, request, response);
        List<Tps011Quincenas> consultaPagina = null;
        consultaPagina = quincenasService.consultaPagina(filtroBusquedaVO, tps011Quincenas, anio, quincena);        
        return consultaPagina;
    }

    @RequestMapping(value = "/guardar", method = RequestMethod.POST)
    @ResponseBody
    public void guardarFormulario(@RequestBody Tps011Quincenas tps011Quincenas) throws Exception {
        quincenasService.guardar(tps011Quincenas);
    }

    @RequestMapping(value = "/modificar", method = RequestMethod.POST)
    @ResponseBody
    public void modificarFormulario(@RequestBody Tps011Quincenas tps011Quincenas) throws Exception {
        quincenasService.modificar(tps011Quincenas);
    }

    @RequestMapping(value = "/eliminar", method = RequestMethod.POST)
    @ResponseBody
    public void eliminarFormulario(@RequestBody Tps011Quincenas tps011Quincenas) throws Exception {
        quincenasService.eliminar(tps011Quincenas);
    }
   
    public List<Tps011Quincenas> consultaTodos() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
