/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.sep.expedicion.servicios.constancias.impl;

import java.util.List;
import mx.sep.expedicion.dao.Tps017RetenedorMapper;
import mx.sep.expedicion.modelo.Tps017Retenedor;
import mx.sep.expedicion.modelo.Tps017RetenedorExample;
import mx.sep.expedicion.servicios.constancias.RetenedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ana.perezh
 */
@Service
public class RetenedorServiceImpl implements RetenedorService {

    @Autowired
    private Tps017RetenedorMapper tps017RetenedorMapper;

    /**
     * Obtiene la información de tps017_retenedor
     *
     * @return List Tps017Retenedor
     * @throws Exception
     */
    public List<Tps017Retenedor> consultaPorAnio(Integer anio) throws Exception {
        Tps017RetenedorExample tps017RetenedorExample = new Tps017RetenedorExample();
        Tps017RetenedorExample.Criteria criteria = tps017RetenedorExample.createCriteria();
        criteria.andAnioIniLessThanOrEqualTo(anio);
        criteria.andAnioFinGreaterThanOrEqualTo(anio);
        return tps017RetenedorMapper.selectByExampleWithBLOBs(tps017RetenedorExample);
    }
}
