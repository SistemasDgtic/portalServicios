/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.sep.expedicion.dao.join;

import java.util.List;
import mx.sep.expedicion.modelo.Tps015IsrAnual;
import mx.sep.expedicion.modelo.Tps015IsrAnualExample;

/**
 *
 * @author ana.perezh
 */
public interface Tps015IsrAnualJoinMapper {

    List<Tps015IsrAnual> selectPageByExample(Tps015IsrAnualExample example);

    int countByExample(Tps015IsrAnualExample example);

}
