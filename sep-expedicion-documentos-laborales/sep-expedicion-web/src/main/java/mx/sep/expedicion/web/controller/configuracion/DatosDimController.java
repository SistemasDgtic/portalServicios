/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.sep.expedicion.web.controller.configuracion;

import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import mx.sep.expedicion.modelo.Tps018DatosDim;
import mx.sep.expedicion.servicios.configuracion.DatosDimService;
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
 * @author itzel.pantoja
 */
@Controller
@RequestMapping(value = "/configuracion/datosDim")
public class DatosDimController extends ConfiguracionBaseController<Tps018DatosDim> {

    @Autowired
    private DatosDimService datosDimService;

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public List<Tps018DatosDim> buscaPaginaRest(@RequestHeader("Range") String rango,
            HttpServletResponse response,
            HttpServletRequest request) throws Exception {
        Integer anio = ("".equals(request.getParameter("anio")) ? null : new Integer(request.getParameter("anio")));
        String folio = (request.getParameter("folio") == null || "".equals(request.getParameter("folio")) || "1969-12-31".equals(request.getParameter("folio")) ? null : request.getParameter("folio"));
        String usuario = (request.getParameter("usuario") == null || "".equals(request.getParameter("usuario")) ? null : request.getParameter("usuario"));
        Tps018DatosDim tps018DatosDim = new Tps018DatosDim();
        tps018DatosDim.setAnio(anio);
        tps018DatosDim.setNumFolio(folio);
        tps018DatosDim.setUsuario(usuario);
        Integer total = datosDimService.consultaContar(tps018DatosDim);
        System.out.println("total: " + total);
        FiltroBusquedaVO filtroBusquedaVO = this.manejarRestPaging(rango, total, request, response);
        List<Tps018DatosDim> consultaPagina = null;
        consultaPagina = datosDimService.consultaPagina(filtroBusquedaVO, tps018DatosDim);
        return consultaPagina;
    }

    @RequestMapping(value = "/guardar", method = RequestMethod.POST)
    @ResponseBody
    public void guardarFormulario(@RequestBody Tps018DatosDim tps018DatosDim) throws Exception {
        datosDimService.guardar(tps018DatosDim);
    }

    @RequestMapping(value = "/modificar", method = RequestMethod.POST)
    @ResponseBody
    public void modificarFormulario(@RequestBody Tps018DatosDim tps018DatosDim) throws Exception {
        datosDimService.modificar(tps018DatosDim);
    }

    @RequestMapping(value = "/eliminar", method = RequestMethod.POST)
    @ResponseBody
    public void eliminarFormulario(@RequestBody Tps018DatosDim tps018DatosDim) throws Exception {
        datosDimService.eliminar(tps018DatosDim);
    }

    public List<Tps018DatosDim> consultaTodos() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
