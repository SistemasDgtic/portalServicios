/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mx.sep.expedicion.servicios.comprobantes;

import mx.sep.expedicion.modelo.Tps021QnasAguinaldo;

/**
 *
 * @author sep
 */
public interface Tps021QnasAguinaldoService {
   
    /**
     * Busca total de registros recuperados en tps021_qnas_aguinaldo
     *
     * @param tps021QnasAguinaldo
     * @return Lista de objetos Tps021QnasAguinaldo
     * @throws Exception
     */
    Integer consultaContar(Tps021QnasAguinaldo tps021QnasAguinaldo) throws Exception;

}