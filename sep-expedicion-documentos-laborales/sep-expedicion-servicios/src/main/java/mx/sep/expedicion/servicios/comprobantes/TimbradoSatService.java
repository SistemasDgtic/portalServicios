package mx.sep.expedicion.servicios.comprobantes;

import java.util.List;
import mx.sep.expedicion.modelo.Tps013TimbraSat;
import mx.sep.expedicion.modelo.Tps014RfcEmisor;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author elisa pérez
 */
public interface TimbradoSatService {
    
    /**
     * Obtiene la información de tps013_timbra_sat por comprobante
     *
     * @param idComprobante
     * @return objeto Tps013TimbraSat
     * @throws Exception
     */
    Tps013TimbraSat consultaPorComprobante(Integer idComprobante) throws Exception;
    
    /**
     * Verifica si existe el comprobante timbrado en tps013_timbra_sat 
     *
     * @param idComprobante
     * @return objeto Tps013TimbraSat
     * @throws Exception
     */
    Integer comprobanteTimbradoExist(Integer idComprobante) throws Exception;
    
    /**
     * Obtiene el rfc del emisor de tps014_rfc_emisor
     *     
     * @return objeto Tps014RfcEmisor
     * @throws Exception
     */
    List<Tps014RfcEmisor> consultaRFCEmisor(Integer qnaProc) throws Exception;
    
}
