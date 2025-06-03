package mx.sep.expedicion.dao;

import java.util.List;
import mx.sep.expedicion.modelo.Tps014RfcEmisor;
import mx.sep.expedicion.modelo.Tps014RfcEmisorExample;
import org.apache.ibatis.annotations.Param;

public interface Tps014RfcEmisorMapper {
    int countByExample(Tps014RfcEmisorExample example);

    int deleteByExample(Tps014RfcEmisorExample example);

    int deleteByPrimaryKey(@Param("rfcEmisor") String rfcEmisor, @Param("qnaProc") Integer qnaProc);

    int insert(Tps014RfcEmisor record);

    int insertSelective(Tps014RfcEmisor record);

    List<Tps014RfcEmisor> selectByExample(Tps014RfcEmisorExample example);

    int updateByExampleSelective(@Param("record") Tps014RfcEmisor record, @Param("example") Tps014RfcEmisorExample example);

    int updateByExample(@Param("record") Tps014RfcEmisor record, @Param("example") Tps014RfcEmisorExample example);
}