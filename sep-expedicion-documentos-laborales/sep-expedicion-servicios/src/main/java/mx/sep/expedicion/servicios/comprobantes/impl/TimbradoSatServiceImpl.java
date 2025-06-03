/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.sep.expedicion.servicios.comprobantes.impl;

import java.util.List;
import mx.sep.expedicion.dao.Tps013TimbraSatMapper;
import mx.sep.expedicion.dao.Tps014RfcEmisorMapper;
import mx.sep.expedicion.modelo.Tps013TimbraSat;
import mx.sep.expedicion.modelo.Tps013TimbraSatExample;
import mx.sep.expedicion.modelo.Tps014RfcEmisor;
import mx.sep.expedicion.modelo.Tps014RfcEmisorExample;
import mx.sep.expedicion.servicios.comprobantes.TimbradoSatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author elisa pérez
 */
@Service
public class TimbradoSatServiceImpl implements TimbradoSatService {

    @Autowired
    private Tps013TimbraSatMapper tps013TimbraSatMapper;
    @Autowired
    private Tps014RfcEmisorMapper tps014RfcEmisorMapper;
  
    /**
     * Obtiene la información de tps013_timbra_sat por comprobante
     *
     * @param idComprobante
     * @return Objeto Tps013TimbraSat
     * @throws Exception
     */
    public Tps013TimbraSat consultaPorComprobante(Integer idComprobante) throws Exception {
        return tps013TimbraSatMapper.selectByPrimaryKey(idComprobante);
    }
    
    /**
     * Verifica si existe el comprobante timbrado en tps013_timbra_sat 
     *
     * @param idComprobante
     * @return Int Tps013TimbraSat
     * @throws Exception
     */
    public Integer comprobanteTimbradoExist(Integer idComprobante) throws Exception {
        Tps013TimbraSatExample tps013TimbraSatExample = new Tps013TimbraSatExample();
        Tps013TimbraSatExample.Criteria criteria = tps013TimbraSatExample.createCriteria();
        if (idComprobante != null){
            criteria.andIdComprobanteEqualTo(idComprobante);
        }
        Integer count = null;
        count = tps013TimbraSatMapper.countByExample(tps013TimbraSatExample);
        return count;
    }
    
    /**
     * Obtiene el rfc del emisor de tps014_rfc_emisor
     *
     * @return Objeto Tps014RfcEmisor
     * @throws Exception
     */
    public List<Tps014RfcEmisor> consultaRFCEmisor(Integer qnaProc) throws Exception {
        Tps014RfcEmisorExample tps014RfcEmisorExample = new Tps014RfcEmisorExample();
        Tps014RfcEmisorExample.Criteria criteria = tps014RfcEmisorExample.createCriteria();
        criteria.andQnaProcEqualTo(qnaProc);
        return tps014RfcEmisorMapper.selectByExample(tps014RfcEmisorExample);
    }
        
}
