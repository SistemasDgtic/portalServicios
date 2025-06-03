/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mx.sep.expedicion.servicios.constancias;

import java.util.List;
import mx.sep.expedicion.modelo.Tps015IsrAnual;
import mx.sep.util.datos.vo.FiltroBusquedaVO;

/**
 *
 * @author ana.perezh
 */
public interface ConstanciaIsrAnualService {
    
    /**
     * Busca total de registros recuperados en tps015_isr_anual
     *
     * @param tps015IsrAnual
     * @return Lista de objetos Tps015IsrAnual
     * @throws Exception
     */
    Integer consultaContar(Tps015IsrAnual tps015IsrAnual) throws Exception;

    /**
     * Busca los registros de constnacias en tps015_isr_anual
     *
     * @param tps015IsrAnual
     * @return Lista de objetos Tps015IsrAnual
     * @throws Exception
     */
    List<Tps015IsrAnual> consultaPagina(FiltroBusquedaVO filtroBusquedaVO, Tps015IsrAnual tps015IsrAnual) throws Exception;

    /**
     * Elimina un registro en tps015_isr_anual
     *
     * @param tps015IsrAnual del comprobante a eliminar
     * @throws Exception
     */
    void eliminar(Tps015IsrAnual tps015IsrAnual) throws Exception;

    /**
     * Actualiza la información de tps015_isr_anual
     *
     * @param tps015IsrAnual información a almacenar
     * @throws Exception
     */
    void modificar(Tps015IsrAnual tps015IsrAnual) throws Exception;

    /**
     * Inserta un registro en la tabla tps015_isr_anual
     *
     * @param tps015IsrAnual información a almacenar
     * @throws Exception
     */
    void guardar(Tps015IsrAnual tps015IsrAnual) throws Exception;

    /**
     * Obtiene la información de tps015_isr_anual
     *
     * @return Lista de objetos Tps015IsrAnual
     * @throws Exception
     */
    List<Tps015IsrAnual> consultaTodos() throws Exception;
    
    /**
     * Obtiene la información de tps015_isr_anual
     *
     * @param idConstancia
     * @return objeto Tps015IsrAnual
     * @throws Exception
     */
    Tps015IsrAnual consultaPorConstancia(Integer idConstancia) throws Exception;

}