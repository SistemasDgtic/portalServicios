/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mx.sep.expedicion.servicios.configuracion.impl;

import mx.sep.expedicion.dao.Tps008RolesUsuMapper;
import mx.sep.expedicion.datos.vo.RolUsuarioVO;
import mx.sep.expedicion.modelo.Tps008RolesUsu;
import mx.sep.expedicion.modelo.Tps008RolesUsuExample;
import mx.sep.expedicion.servicios.configuracion.RolUsuarioService;
import mx.sep.util.servicios.ErrorInfraestructura;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Service;

/**
 *
 * @author Elisa Pérez
 */
@Service
public class RolUsuarioServiceImpl implements RolUsuarioService {
    
    @Autowired
    private Tps008RolesUsuMapper tps008RolesUsuMapper;        

    public void modificar(RolUsuarioVO usuarioRolVO) throws Exception {
        try {
            Tps008RolesUsu tps008RolesUsu = new Tps008RolesUsu();
            Tps008RolesUsuExample tps008RolesUsuExample = new Tps008RolesUsuExample();
            Tps008RolesUsuExample.Criteria criteria = tps008RolesUsuExample.createCriteria();
                    criteria.andIdUsuarioEqualTo(usuarioRolVO.getIdUsuario());
                    criteria.andIdRolEqualTo(usuarioRolVO.getIdRolAnterior());
            tps008RolesUsu.setIdUsuario(usuarioRolVO.getIdUsuario());
            tps008RolesUsu.setIdRol(usuarioRolVO.getIdRol());
            tps008RolesUsuMapper.updateByExampleSelective(tps008RolesUsu, tps008RolesUsuExample);
        } catch (DuplicateKeyException ex) {
			throw new ErrorInfraestructura("No se puede actualizar, el usuario ya tiene asignado ese rol", ex);
	}
    }
    
}
