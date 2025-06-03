/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mx.sep.expedicion.dao.join;

import java.util.List;
import mx.sep.expedicion.modelo.Tps011Quincenas;
import mx.sep.expedicion.modelo.Tps011QuincenasExample;

/**
 *
 * @author Elisa Pérez
 */
public interface Tps011QuincenasJoinMapper {
    
    List<Tps011Quincenas> selectPageByExample(Tps011QuincenasExample example);    
}
