package mx.sep.expedicion.dao;

import java.util.List;
import mx.sep.expedicion.modelo.Tps018DatosDim;
import mx.sep.expedicion.modelo.Tps018DatosDimExample;
import org.apache.ibatis.annotations.Param;

public interface Tps018DatosDimMapper {
    int countByExample(Tps018DatosDimExample example);

    int deleteByExample(Tps018DatosDimExample example);

    int deleteByPrimaryKey(Integer idDatos);

    int insert(Tps018DatosDim record);

    int insertSelective(Tps018DatosDim record);

    List<Tps018DatosDim> selectByExample(Tps018DatosDimExample example);

    Tps018DatosDim selectByPrimaryKey(Integer idDatos);

    int updateByExampleSelective(@Param("record") Tps018DatosDim record, @Param("example") Tps018DatosDimExample example);

    int updateByExample(@Param("record") Tps018DatosDim record, @Param("example") Tps018DatosDimExample example);

    int updateByPrimaryKeySelective(Tps018DatosDim record);

    int updateByPrimaryKey(Tps018DatosDim record);
}