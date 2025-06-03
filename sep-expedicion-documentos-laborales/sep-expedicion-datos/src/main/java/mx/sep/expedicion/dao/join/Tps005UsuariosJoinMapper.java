/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.sep.expedicion.dao.join;

import java.util.List;
import mx.sep.expedicion.datos.vo.RolUsuarioVO;
import mx.sep.expedicion.modelo.Tps005Usuarios;
import mx.sep.expedicion.modelo.custom.Tps005UsuariosExample;

/**
 *
 * @author eduardo.hernandez
 */
public interface Tps005UsuariosJoinMapper {

    List<RolUsuarioVO> selectPageByExample(Tps005UsuariosExample example);

    Tps005Usuarios selectUsuarioByExample(Tps005UsuariosExample example);
    
    int selectMaxPrimaryKey();

}
