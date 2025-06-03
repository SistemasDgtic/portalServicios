/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.sep.expedicion.servicios.comprobantes;

import java.util.List;
import mx.sep.expedicion.modelo.Tps003Comprobante;
import mx.sep.util.datos.vo.FiltroBusquedaVO;

/**
 *
 * @author eduardo.hernandez
 */
public interface ComprobantePagoService {

    /**
     * Busca total de registros recuperados
     *
     * @param tps003Comprobante
     * @return Lista de objetos Tps003Comprobantes
     * @throws Exception
     */
    Integer consultaContar(Tps003Comprobante tps003Comprobante, String anio, String quincena) throws Exception;

    /**
     * Busca los registros de comprobantes
     *
     * @param tps003Comprobante
     * @return Lista de objetos Tps003Comprobantes
     * @throws Exception
     */
    List<Tps003Comprobante> consultaPagina(FiltroBusquedaVO filtroBusquedaVO, Tps003Comprobante tps003Comprobante, String anio, String quincena) throws Exception;

    /**
     * Elimina un registro de comprobante
     *
     * @param tps003Comprobante del comprobante a eliminar
     * @throws Exception
     */
    void eliminar(Tps003Comprobante tps003Comprobante) throws Exception;

    /**
     * Actualiza la información de tps003_comprobante
     *
     * @param tps003Comprobante información a almacenar
     * @throws Exception
     */
    void modificar(Tps003Comprobante tps003Comprobante) throws Exception;

    /**
     * Inserta un registro en la tabla tps003_comprobante
     *
     * @param tps003Comprobante información a almacenar
     * @throws Exception
     */
    void guardar(Tps003Comprobante tps003Comprobante) throws Exception;

    /**
     * Obtiene la información de tps003_comprobante
     *
     * @return Lista de objetos Tps003Comprobantes
     * @throws Exception
     */
    List<Tps003Comprobante> consultaTodos() throws Exception;
    
    /**
     * Obtiene la información de tps003_comprobante
     *
     * @param idComprobante
     * @return objeto Tps003Comprobante
     * @throws Exception
     */
    Tps003Comprobante consultaPorComprobante(Integer idComprobante) throws Exception;

}
