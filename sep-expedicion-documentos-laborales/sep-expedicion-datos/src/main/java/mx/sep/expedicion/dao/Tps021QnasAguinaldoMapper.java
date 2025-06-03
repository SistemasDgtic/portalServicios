package mx.sep.expedicion.dao;

import java.util.List;
import mx.sep.expedicion.modelo.Tps021QnasAguinaldo;
import mx.sep.expedicion.modelo.Tps021QnasAguinaldoExample;
import org.apache.ibatis.annotations.Param;

public interface Tps021QnasAguinaldoMapper {
    int countByExample(Tps021QnasAguinaldoExample example);

    int deleteByExample(Tps021QnasAguinaldoExample example);

    int deleteByPrimaryKey(Integer qnaProc);

    int insert(Tps021QnasAguinaldo record);

    int insertSelective(Tps021QnasAguinaldo record);

    List<Tps021QnasAguinaldo> selectByExample(Tps021QnasAguinaldoExample example);

    Tps021QnasAguinaldo selectByPrimaryKey(Integer qnaProc);

    int updateByExampleSelective(@Param("record") Tps021QnasAguinaldo record, @Param("example") Tps021QnasAguinaldoExample example);

    int updateByExample(@Param("record") Tps021QnasAguinaldo record, @Param("example") Tps021QnasAguinaldoExample example);

    int updateByPrimaryKeySelective(Tps021QnasAguinaldo record);

    int updateByPrimaryKey(Tps021QnasAguinaldo record);
}