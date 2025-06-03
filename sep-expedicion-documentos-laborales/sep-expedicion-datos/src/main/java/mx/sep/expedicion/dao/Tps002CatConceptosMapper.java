package mx.sep.expedicion.dao;

import java.util.List;
import mx.sep.expedicion.modelo.Tps002CatConceptos;
import mx.sep.expedicion.modelo.Tps002CatConceptosExample;
import org.apache.ibatis.annotations.Param;

public interface Tps002CatConceptosMapper {
    int countByExample(Tps002CatConceptosExample example);

    int deleteByExample(Tps002CatConceptosExample example);

    int deleteByPrimaryKey(@Param("percDed") String percDed, @Param("concepto") String concepto);

    int insert(Tps002CatConceptos record);

    int insertSelective(Tps002CatConceptos record);

    List<Tps002CatConceptos> selectByExample(Tps002CatConceptosExample example);

    Tps002CatConceptos selectByPrimaryKey(@Param("percDed") String percDed, @Param("concepto") String concepto);

    int updateByExampleSelective(@Param("record") Tps002CatConceptos record, @Param("example") Tps002CatConceptosExample example);

    int updateByExample(@Param("record") Tps002CatConceptos record, @Param("example") Tps002CatConceptosExample example);

    int updateByPrimaryKeySelective(Tps002CatConceptos record);

    int updateByPrimaryKey(Tps002CatConceptos record);
}