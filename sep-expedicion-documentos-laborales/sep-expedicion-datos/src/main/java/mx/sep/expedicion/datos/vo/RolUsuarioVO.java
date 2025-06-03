/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mx.sep.expedicion.datos.vo;

import mx.sep.expedicion.modelo.Tps005Usuarios;

/**
 *
 * @author Elisa Pérez
 */
public class RolUsuarioVO extends Tps005Usuarios{
    protected Integer idRol;
    private Integer idRolAnterior;

    
    public Integer getIdRol() {
        return idRol;
    }

    public void setIdRol(Integer idRol) {
        this.idRol = idRol;
    }

    public Integer getIdRolAnterior() {
        return idRolAnterior;
    }
    
    public void setIdRolAnterior(Integer idRolAnterior) {
        this.idRolAnterior = idRolAnterior;
    }
    
}
