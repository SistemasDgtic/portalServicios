/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.sep.expedicion.dao.join;

import java.util.List;
import mx.sep.expedicion.modelo.Tps003Comprobante;
import mx.sep.expedicion.modelo.Tps003ComprobanteExample;

/**
 *
 * @author eduardo.hernandez
 */
public interface Tps003ComprobanteJoinMapper {

    List<Tps003Comprobante> selectPageByExample(Tps003ComprobanteExample example);
    
    int countByExample(Tps003ComprobanteExample example);

}
