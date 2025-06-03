package mx.sep.expedicion.servicios.comprobantes.impl;

import mx.sep.expedicion.dao.Tps021QnasAguinaldoMapper;
import mx.sep.expedicion.modelo.Tps021QnasAguinaldo;
import mx.sep.expedicion.modelo.Tps021QnasAguinaldoExample;
import mx.sep.expedicion.servicios.comprobantes.Tps021QnasAguinaldoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author sep
 */
@Service
public class Tps021QnasAguinaldoServiceImpl implements Tps021QnasAguinaldoService {

    @Autowired
    private Tps021QnasAguinaldoMapper tps021QnasAguinaldoMapper;

    /**
     * Busca total de registros recuperados
     *
     * @return Lista de objetos Tps021QnasAguinaldo
     * @throws Exception
     */
    @Override
    public Integer consultaContar(Tps021QnasAguinaldo tps021QnasAguinaldo) throws Exception {
        Tps021QnasAguinaldoExample tps021QnasAguinaldoExample = new Tps021QnasAguinaldoExample();
        Tps021QnasAguinaldoExample.Criteria criteria = tps021QnasAguinaldoExample.createCriteria();
        criteria.andQnaProcEqualTo(tps021QnasAguinaldo.getQnaProc());
        criteria.andConsQnaProcEqualTo(tps021QnasAguinaldo.getConsQnaProc());
        //System.out.println("QNAPROC: " + tps021QnasAguinaldo.getQnaProc() + "CONSQNAPROC: " + tps021QnasAguinaldo.getConsQnaProc());
        Integer count = tps021QnasAguinaldoMapper.countByExample(tps021QnasAguinaldoExample);
        return count;
    }
}
