/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mx.sep.expedicion.dao.join;

import java.util.List;
import mx.sep.expedicion.modelo.Tps018DatosDim;
import mx.sep.expedicion.modelo.Tps018DatosDimExample;

/**
 *
 * @author itzel.pantoja
 */
public interface Tps018DatosDimJoinMapper {
    
    List<Tps018DatosDim> selectPageByExample(Tps018DatosDimExample example);    
    
}
