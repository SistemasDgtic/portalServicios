package mx.sep.expedicion.dao;

import java.util.List;
import mx.sep.expedicion.modelo.Tsp005Periodos;
import mx.sep.expedicion.modelo.Tsp005PeriodosExample;
import org.apache.ibatis.annotations.Param;

public interface Tsp005PeriodosMapper {
    int countByExample(Tsp005PeriodosExample example);

    int deleteByExample(Tsp005PeriodosExample example);

    int deleteByPrimaryKey(@Param("anio") Short anio, @Param("mes") Short mes, @Param("quincena") Short quincena);

    int insert(Tsp005Periodos record);

    int insertSelective(Tsp005Periodos record);

    List<Tsp005Periodos> selectByExample(Tsp005PeriodosExample example);

    int updateByExampleSelective(@Param("record") Tsp005Periodos record, @Param("example") Tsp005PeriodosExample example);

    int updateByExample(@Param("record") Tsp005Periodos record, @Param("example") Tsp005PeriodosExample example);
}