/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.sep.expedicion.servicios.configuracion;

import java.util.List;
import mx.sep.expedicion.modelo.Tps018DatosDim;
import mx.sep.util.datos.vo.FiltroBusquedaVO;

/**
 *
 * @author itzel.pantoja
 */
public interface DatosDimService {

    Integer consultaContar(Tps018DatosDim tps018DatosDim) throws Exception;

    List<Tps018DatosDim> consultaPagina(FiltroBusquedaVO filtroBusquedaVO, Tps018DatosDim tps018DatosDim) throws Exception;

    List<Tps018DatosDim> consultaTodos() throws Exception;

    void eliminar(Tps018DatosDim tps018DatosDim) throws Exception;

    void guardar(Tps018DatosDim tps018DatosDim) throws Exception;

    void modificar(Tps018DatosDim tps018DatosDim) throws Exception;
}
