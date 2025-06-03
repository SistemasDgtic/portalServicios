/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mx.sep.expedicion.dao.join;

import java.util.List;
import mx.sep.expedicion.modelo.Tps009Preguntas;
import mx.sep.expedicion.modelo.custom.Tps009PreguntasExample;

/**
 *
 * @author Elisa Pérez
 */
public interface Tps009PreguntasJoinMapper {
    
    List<Tps009Preguntas> selectPageByExample(Tps009PreguntasExample example);    
    
    int selectMaxPrimaryKey();
    
}
