/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mx.sep.expedicion.web.controller.configuracion;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import mx.sep.util.web.ControllerBase;

/**
 *
 * @author Elisa Pérez
 */
public abstract class ConfiguracionBaseController<T extends Object> extends ControllerBase{
    
        public abstract List<T> buscaPaginaRest(String rango, HttpServletResponse response, HttpServletRequest request) throws Exception;

	public abstract void guardarFormulario(T object) throws Exception;

	public abstract void modificarFormulario(T object) throws Exception;

	public abstract void eliminarFormulario(T object) throws Exception;

	public abstract List<T> consultaTodos() throws Exception;
    
}
