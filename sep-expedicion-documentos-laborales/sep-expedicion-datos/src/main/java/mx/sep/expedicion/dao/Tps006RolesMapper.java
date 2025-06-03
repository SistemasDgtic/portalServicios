package mx.sep.expedicion.dao;

import java.util.List;
import mx.sep.expedicion.modelo.Tps006Roles;
import mx.sep.expedicion.modelo.Tps006RolesExample;
import org.apache.ibatis.annotations.Param;

public interface Tps006RolesMapper {
    int countByExample(Tps006RolesExample example);

    int deleteByExample(Tps006RolesExample example);

    int deleteByPrimaryKey(Integer idRol);

    int insert(Tps006Roles record);

    int insertSelective(Tps006Roles record);

    List<Tps006Roles> selectByExample(Tps006RolesExample example);

    Tps006Roles selectByPrimaryKey(Integer idRol);

    int updateByExampleSelective(@Param("record") Tps006Roles record, @Param("example") Tps006RolesExample example);

    int updateByExample(@Param("record") Tps006Roles record, @Param("example") Tps006RolesExample example);

    int updateByPrimaryKeySelective(Tps006Roles record);

    int updateByPrimaryKey(Tps006Roles record);
}