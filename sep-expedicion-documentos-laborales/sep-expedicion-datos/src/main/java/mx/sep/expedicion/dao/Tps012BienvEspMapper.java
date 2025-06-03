package mx.sep.expedicion.dao;

import java.util.List;
import mx.sep.expedicion.modelo.Tps012BienvEsp;
import mx.sep.expedicion.modelo.Tps012BienvEspExample;
import org.apache.ibatis.annotations.Param;

public interface Tps012BienvEspMapper {
    int countByExample(Tps012BienvEspExample example);

    int deleteByExample(Tps012BienvEspExample example);

    int deleteByPrimaryKey(String username);

    int insert(Tps012BienvEsp record);

    int insertSelective(Tps012BienvEsp record);

    List<Tps012BienvEsp> selectByExample(Tps012BienvEspExample example);

    int updateByExampleSelective(@Param("record") Tps012BienvEsp record, @Param("example") Tps012BienvEspExample example);

    int updateByExample(@Param("record") Tps012BienvEsp record, @Param("example") Tps012BienvEspExample example);
}