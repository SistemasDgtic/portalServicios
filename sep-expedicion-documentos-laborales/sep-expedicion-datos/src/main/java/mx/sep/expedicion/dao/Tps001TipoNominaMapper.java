package mx.sep.expedicion.dao;

import java.util.List;
import mx.sep.expedicion.modelo.Tps001TipoNomina;
import mx.sep.expedicion.modelo.Tps001TipoNominaExample;
import org.apache.ibatis.annotations.Param;

public interface Tps001TipoNominaMapper {
    int countByExample(Tps001TipoNominaExample example);

    int deleteByExample(Tps001TipoNominaExample example);

    int deleteByPrimaryKey(String idTipoNomina);

    int insert(Tps001TipoNomina record);

    int insertSelective(Tps001TipoNomina record);

    List<Tps001TipoNomina> selectByExample(Tps001TipoNominaExample example);

    Tps001TipoNomina selectByPrimaryKey(String idTipoNomina);

    int updateByExampleSelective(@Param("record") Tps001TipoNomina record, @Param("example") Tps001TipoNominaExample example);

    int updateByExample(@Param("record") Tps001TipoNomina record, @Param("example") Tps001TipoNominaExample example);

    int updateByPrimaryKeySelective(Tps001TipoNomina record);

    int updateByPrimaryKey(Tps001TipoNomina record);
}