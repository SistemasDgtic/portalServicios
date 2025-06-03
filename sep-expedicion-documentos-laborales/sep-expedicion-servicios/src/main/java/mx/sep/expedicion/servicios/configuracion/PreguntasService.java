/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mx.sep.expedicion.servicios.configuracion;

import java.util.List;
import mx.sep.expedicion.modelo.Tps009Preguntas;
import mx.sep.util.datos.vo.FiltroBusquedaVO;

/**
 *
 * @author Elisa Pérez
 */
public interface PreguntasService {
    
        Integer consultaContar(Tps009Preguntas tps009Preguntas) throws Exception;
        
        List<Tps009Preguntas> consultaPagina(FiltroBusquedaVO filtroBusquedaVO, Tps009Preguntas tps009Preguntas) throws Exception;

	List<Tps009Preguntas> consultaPorPregunta(Integer idPregunta) throws Exception;

	List<Tps009Preguntas> consultaTodos() throws Exception;

	void eliminar(Tps009Preguntas tps009Preguntas) throws Exception;

	void guardar(Tps009Preguntas tps009Preguntas) throws Exception;

	void modificar(Tps009Preguntas tps009Preguntas) throws Exception;	
    
}
