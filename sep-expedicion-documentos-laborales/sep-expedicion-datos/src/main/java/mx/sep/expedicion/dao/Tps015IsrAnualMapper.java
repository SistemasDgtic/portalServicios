package mx.sep.expedicion.dao;

import java.util.List;
import mx.sep.expedicion.modelo.Tps015IsrAnual;
import mx.sep.expedicion.modelo.Tps015IsrAnualExample;
import org.apache.ibatis.annotations.Param;

public interface Tps015IsrAnualMapper {
    int countByExample(Tps015IsrAnualExample example);

    int deleteByExample(Tps015IsrAnualExample example);

    int deleteByPrimaryKey(Integer idConstancia);

    int insert(Tps015IsrAnual record);

    int insertSelective(Tps015IsrAnual record);

    List<Tps015IsrAnual> selectByExample(Tps015IsrAnualExample example);

    Tps015IsrAnual selectByPrimaryKey(Integer idConstancia);

    int updateByExampleSelective(@Param("record") Tps015IsrAnual record, @Param("example") Tps015IsrAnualExample example);

    int updateByExample(@Param("record") Tps015IsrAnual record, @Param("example") Tps015IsrAnualExample example);

    int updateByPrimaryKeySelective(Tps015IsrAnual record);

    int updateByPrimaryKey(Tps015IsrAnual record);
}