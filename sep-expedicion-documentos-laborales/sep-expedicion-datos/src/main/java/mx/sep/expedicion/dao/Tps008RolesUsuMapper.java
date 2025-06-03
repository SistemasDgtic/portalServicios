package mx.sep.expedicion.dao;

import java.util.List;
import mx.sep.expedicion.modelo.Tps008RolesUsu;
import mx.sep.expedicion.modelo.Tps008RolesUsuExample;
import org.apache.ibatis.annotations.Param;

public interface Tps008RolesUsuMapper {
    int countByExample(Tps008RolesUsuExample example);

    int deleteByExample(Tps008RolesUsuExample example);

    int deleteByPrimaryKey(@Param("idUsuario") Integer idUsuario, @Param("idRol") Integer idRol);

    int insert(Tps008RolesUsu record);

    int insertSelective(Tps008RolesUsu record);

    List<Tps008RolesUsu> selectByExample(Tps008RolesUsuExample example);

    int updateByExampleSelective(@Param("record") Tps008RolesUsu record, @Param("example") Tps008RolesUsuExample example);

    int updateByExample(@Param("record") Tps008RolesUsu record, @Param("example") Tps008RolesUsuExample example);
}