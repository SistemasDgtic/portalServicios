/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mx.sep.expedicion.servicios.configuracion.impl;

import java.util.List;
import mx.sep.util.datos.vo.FiltroBusquedaVO;

/**
 *
 * @author Elisa Pérez
 */
public abstract class ConfiguracionBase <T extends Object>{
    
    public abstract List<T> consultaPagina(FiltroBusquedaVO filtroBusquedaVO, T object) throws Exception;
    
    public abstract Integer consultaContar(T object) throws Exception;
    
    public abstract void guardar(T object) throws Exception;
    
    public abstract void modificar(T object) throws Exception;
    
    public abstract void eliminar(T object) throws Exception;
    
    public abstract List<T> consultaTodos() throws Exception;
    
}
