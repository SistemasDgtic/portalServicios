package mx.sep.expedicion.dao;

import java.util.List;
import mx.sep.expedicion.modelo.Tps009Preguntas;
import mx.sep.expedicion.modelo.Tps009PreguntasExample;
import org.apache.ibatis.annotations.Param;

public interface Tps009PreguntasMapper {
    int countByExample(Tps009PreguntasExample example);

    int deleteByExample(Tps009PreguntasExample example);

    int deleteByPrimaryKey(Integer idPregunta);

    int insert(Tps009Preguntas record);

    int insertSelective(Tps009Preguntas record);

    List<Tps009Preguntas> selectByExample(Tps009PreguntasExample example);

    Tps009Preguntas selectByPrimaryKey(Integer idPregunta);

    int updateByExampleSelective(@Param("record") Tps009Preguntas record, @Param("example") Tps009PreguntasExample example);

    int updateByExample(@Param("record") Tps009Preguntas record, @Param("example") Tps009PreguntasExample example);

    int updateByPrimaryKeySelective(Tps009Preguntas record);

    int updateByPrimaryKey(Tps009Preguntas record);
}