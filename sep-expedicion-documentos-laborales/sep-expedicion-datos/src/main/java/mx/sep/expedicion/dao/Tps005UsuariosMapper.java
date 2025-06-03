package mx.sep.expedicion.dao;

import java.util.List;
import mx.sep.expedicion.modelo.Tps005Usuarios;
import mx.sep.expedicion.modelo.Tps005UsuariosExample;
import org.apache.ibatis.annotations.Param;

public interface Tps005UsuariosMapper {
    int countByExample(Tps005UsuariosExample example);

    int deleteByExample(Tps005UsuariosExample example);

    int deleteByPrimaryKey(Integer idUsuario);

    int insert(Tps005Usuarios record);

    int insertSelective(Tps005Usuarios record);

    List<Tps005Usuarios> selectByExample(Tps005UsuariosExample example);

    Tps005Usuarios selectByPrimaryKey(Integer idUsuario);

    int updateByExampleSelective(@Param("record") Tps005Usuarios record, @Param("example") Tps005UsuariosExample example);

    int updateByExample(@Param("record") Tps005Usuarios record, @Param("example") Tps005UsuariosExample example);

    int updateByPrimaryKeySelective(Tps005Usuarios record);

    int updateByPrimaryKey(Tps005Usuarios record);
   
}