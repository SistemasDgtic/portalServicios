/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mx.sep.expedicion.servicios.configuracion;

import mx.sep.expedicion.datos.vo.RolUsuarioVO;

/**
 *
 * @author Elisa Pérez
 */
public interface RolUsuarioService {    
    
    void modificar(RolUsuarioVO usuarioRolVO) throws Exception;
    
}
