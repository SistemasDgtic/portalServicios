package mx.sep.expedicion.dao;

import java.util.List;
import mx.sep.expedicion.modelo.Tps022Carrera;
import mx.sep.expedicion.modelo.Tps022CarreraExample;
import org.apache.ibatis.annotations.Param;

public interface Tps022CarreraMapper {
    int countByExample(Tps022CarreraExample example);

    int deleteByExample(Tps022CarreraExample example);

    int deleteByPrimaryKey(Integer idCarrera);

    int insert(Tps022Carrera record);

    int insertSelective(Tps022Carrera record);

    List<Tps022Carrera> selectByExample(Tps022CarreraExample example);

    Tps022Carrera selectByPrimaryKey(Integer idCarrera);

    int updateByExampleSelective(@Param("record") Tps022Carrera record, @Param("example") Tps022CarreraExample example);

    int updateByExample(@Param("record") Tps022Carrera record, @Param("example") Tps022CarreraExample example);

    int updateByPrimaryKeySelective(Tps022Carrera record);

    int updateByPrimaryKey(Tps022Carrera record);
}