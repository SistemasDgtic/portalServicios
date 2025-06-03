/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.sep.expedicion.servicios.constancias;

import java.util.List;
import mx.sep.expedicion.modelo.Tps017Retenedor;

/**
 *
 * @author ana.perezh
 */
public interface RetenedorService {

    /**
     * Obtiene la información de tps017_retenedor
     *
     * @param anio
     * @return objeto Tps017Retenedor
     * @throws Exception
     */
    List<Tps017Retenedor> consultaPorAnio(Integer anio) throws Exception;
}
