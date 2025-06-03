package mx.sep.expedicion.dao;

import java.util.List;
import mx.sep.expedicion.modelo.Tps013TimbraSat;
import mx.sep.expedicion.modelo.Tps013TimbraSatExample;
import org.apache.ibatis.annotations.Param;

public interface Tps013TimbraSatMapper {
    int countByExample(Tps013TimbraSatExample example);

    int deleteByExample(Tps013TimbraSatExample example);

    int deleteByPrimaryKey(Integer idComprobante);

    int insert(Tps013TimbraSat record);

    int insertSelective(Tps013TimbraSat record);

    List<Tps013TimbraSat> selectByExample(Tps013TimbraSatExample example);

    Tps013TimbraSat selectByPrimaryKey(Integer idComprobante);

    int updateByExampleSelective(@Param("record") Tps013TimbraSat record, @Param("example") Tps013TimbraSatExample example);

    int updateByExample(@Param("record") Tps013TimbraSat record, @Param("example") Tps013TimbraSatExample example);

    int updateByPrimaryKeySelective(Tps013TimbraSat record);

    int updateByPrimaryKey(Tps013TimbraSat record);
}