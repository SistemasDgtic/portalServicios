package mx.sep.expedicion.dao;

import java.util.List;
import mx.sep.expedicion.modelo.Tps023DocNivel;
import mx.sep.expedicion.modelo.Tps023DocNivelExample;
import org.apache.ibatis.annotations.Param;

public interface Tps023DocNivelMapper {
    int countByExample(Tps023DocNivelExample example);

    int deleteByExample(Tps023DocNivelExample example);

    int deleteByPrimaryKey(@Param("idDoc") Integer idDoc, @Param("nivAcademico") Integer nivAcademico);

    int insert(Tps023DocNivel record);

    int insertSelective(Tps023DocNivel record);

    List<Tps023DocNivel> selectByExample(Tps023DocNivelExample example);

    int updateByExampleSelective(@Param("record") Tps023DocNivel record, @Param("example") Tps023DocNivelExample example);

    int updateByExample(@Param("record") Tps023DocNivel record, @Param("example") Tps023DocNivelExample example);
}