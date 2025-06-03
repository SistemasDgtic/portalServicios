package mx.sep.expedicion.dao;

import java.util.List;
import mx.sep.expedicion.modelo.Tps022AnualSdo;
import mx.sep.expedicion.modelo.Tps022AnualSdoExample;
import org.apache.ibatis.annotations.Param;

public interface Tps022AnualSdoMapper {
    int countByExample(Tps022AnualSdoExample example);

    int deleteByExample(Tps022AnualSdoExample example);

    int deleteByPrimaryKey(@Param("anio") Short anio, @Param("rfc") String rfc);

    int insert(Tps022AnualSdo record);

    int insertSelective(Tps022AnualSdo record);

    List<Tps022AnualSdo> selectByExample(Tps022AnualSdoExample example);

    Tps022AnualSdo selectByPrimaryKey(@Param("anio") Short anio, @Param("rfc") String rfc);

    int updateByExampleSelective(@Param("record") Tps022AnualSdo record, @Param("example") Tps022AnualSdoExample example);

    int updateByExample(@Param("record") Tps022AnualSdo record, @Param("example") Tps022AnualSdoExample example);

    int updateByPrimaryKeySelective(Tps022AnualSdo record);

    int updateByPrimaryKey(Tps022AnualSdo record);
}