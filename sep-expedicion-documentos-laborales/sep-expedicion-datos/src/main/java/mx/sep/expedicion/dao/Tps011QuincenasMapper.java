package mx.sep.expedicion.dao;

import java.util.List;
import mx.sep.expedicion.modelo.Tps011Quincenas;
import mx.sep.expedicion.modelo.Tps011QuincenasExample;
import org.apache.ibatis.annotations.Param;

public interface Tps011QuincenasMapper {
    int countByExample(Tps011QuincenasExample example);

    int deleteByExample(Tps011QuincenasExample example);

    int deleteByPrimaryKey(Integer qnaProc);

    int insert(Tps011Quincenas record);

    int insertSelective(Tps011Quincenas record);

    List<Tps011Quincenas> selectByExample(Tps011QuincenasExample example);

    Tps011Quincenas selectByPrimaryKey(Integer qnaProc);

    int updateByExampleSelective(@Param("record") Tps011Quincenas record, @Param("example") Tps011QuincenasExample example);

    int updateByExample(@Param("record") Tps011Quincenas record, @Param("example") Tps011QuincenasExample example);

    int updateByPrimaryKeySelective(Tps011Quincenas record);

    int updateByPrimaryKey(Tps011Quincenas record);
}