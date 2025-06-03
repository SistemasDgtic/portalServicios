/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.sep.expedicion.web.controller.configuracion;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import mx.sep.expedicion.modelo.Tps009Preguntas;
import mx.sep.expedicion.servicios.configuracion.PreguntasService;
import mx.sep.util.datos.vo.FiltroBusquedaVO;
import mx.sep.util.servicios.LoggerUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
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
@RequestMapping(value = "/configuracion/preguntas")
public class PreguntasController extends ConfiguracionBaseController<Tps009Preguntas> {

    @Autowired
    private PreguntasService preguntasService;

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public List<Tps009Preguntas> buscaPaginaRest(@RequestHeader("Range") String rango,
            HttpServletResponse response,
            HttpServletRequest request) throws Exception {
        Integer idPregunta = ("".equals(request.getParameter("idPregunta")) ? null : new Integer(request.getParameter("idPregunta")));
        String descripcion = ("".equals(new String(request.getParameter("descripcion").getBytes("ISO-8859-1"), "UTF-8")) ? null : "" + new String(request.getParameter("descripcion").getBytes("ISO-8859-1"), "UTF-8"));
        Boolean activo = ("".equals(request.getParameter("activo")) ? true : Boolean.valueOf(request.getParameter("activo")));
        LoggerUtil.debug(this, "Valor: idPregunta=" + idPregunta + ", descripcion=" + descripcion + ", activo=" + activo);
        Tps009Preguntas tps009Preguntas = new Tps009Preguntas();
        tps009Preguntas.setIdPregunta(idPregunta);
        tps009Preguntas.setDescripcion(descripcion);
        tps009Preguntas.setActivo(activo);
        Integer total = preguntasService.consultaContar(tps009Preguntas);
        FiltroBusquedaVO filtroBusquedaVO = this.manejarRestPaging(rango, total, request, response);
        List<Tps009Preguntas> consultaPagina = null;
        consultaPagina = preguntasService.consultaPagina(filtroBusquedaVO, tps009Preguntas);
        return consultaPagina;
    }

    @RequestMapping(value = "/guardar", method = RequestMethod.POST)
    @ResponseBody
    public void guardarFormulario(@RequestBody Tps009Preguntas tps009Preguntas) throws Exception {
        preguntasService.guardar(tps009Preguntas);
    }

    @RequestMapping(value = "/modificar", method = RequestMethod.POST)
    @ResponseBody
    public void modificarFormulario(@RequestBody Tps009Preguntas tps009Preguntas) throws Exception {
        preguntasService.modificar(tps009Preguntas);
    }

    @RequestMapping(value = "/eliminar", method = RequestMethod.POST)
    @ResponseBody
    public void eliminarFormulario(@RequestBody Tps009Preguntas tps009Preguntas) throws Exception {
        preguntasService.eliminar(tps009Preguntas);
    }

    @RequestMapping(value = "/todos/{aleatorio}", method = RequestMethod.GET)
    @ResponseBody
    public List<Tps009Preguntas> consultaTodos(@PathVariable Integer aleatorio) throws Exception {
        return preguntasService.consultaTodos();
    }

    @Override
    public List<Tps009Preguntas> consultaTodos() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
