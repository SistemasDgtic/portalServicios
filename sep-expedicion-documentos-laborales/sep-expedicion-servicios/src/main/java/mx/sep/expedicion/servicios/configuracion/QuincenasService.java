/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mx.sep.expedicion.servicios.configuracion;

import java.util.List;
import mx.sep.expedicion.modelo.Tps011Quincenas;
import mx.sep.util.datos.vo.FiltroBusquedaVO;

/**
 *
 * @author Elisa Pérez
 */
public interface QuincenasService {
    
        Integer consultaContar(Tps011Quincenas tps011Quincenas, String anio, String quincena) throws Exception;
        
        List<Tps011Quincenas> consultaPagina(FiltroBusquedaVO filtroBusquedaVO, Tps011Quincenas tps011Quincenas, String anio, String quincena) throws Exception;	

	List<Tps011Quincenas> consultaTodos() throws Exception;

	void eliminar(Tps011Quincenas tps011Quincenas) throws Exception;

	void guardar(Tps011Quincenas tps011Quincenas) throws Exception;

	void modificar(Tps011Quincenas tps011Quincenas) throws Exception;
}
