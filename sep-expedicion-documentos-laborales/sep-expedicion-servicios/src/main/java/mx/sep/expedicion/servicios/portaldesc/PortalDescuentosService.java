/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.sep.expedicion.servicios.portaldesc;

import mx.sep.expedicion.modelo.Tps020RegNomipay;

/**
 *
 * @author ana.perezh
 */
public interface PortalDescuentosService {

    /**
     * Inserta un nuevo registro en tps020_reg_nomipay
     *
     * @param tps020RegNomipay
     * @return Tps020RegNomipay
     * @throws Exception
     */
    Tps020RegNomipay guardar(Tps020RegNomipay tps020RegNomipay) throws Exception;
}
