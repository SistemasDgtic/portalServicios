package mx.sep.expedicion.dao;

import java.util.List;
import mx.sep.expedicion.modelo.Tps017Retenedor;
import mx.sep.expedicion.modelo.Tps017RetenedorExample;
import org.apache.ibatis.annotations.Param;

public interface Tps017RetenedorMapper {
    int countByExample(Tps017RetenedorExample example);

    int deleteByExample(Tps017RetenedorExample example);

    int deleteByPrimaryKey(Integer idRetenedor);

    int insert(Tps017Retenedor record);

    int insertSelective(Tps017Retenedor record);

    List<Tps017Retenedor> selectByExampleWithBLOBs(Tps017RetenedorExample example);

    List<Tps017Retenedor> selectByExample(Tps017RetenedorExample example);

    Tps017Retenedor selectByPrimaryKey(Integer idRetenedor);

    int updateByExampleSelective(@Param("record") Tps017Retenedor record, @Param("example") Tps017RetenedorExample example);

    int updateByExampleWithBLOBs(@Param("record") Tps017Retenedor record, @Param("example") Tps017RetenedorExample example);

    int updateByExample(@Param("record") Tps017Retenedor record, @Param("example") Tps017RetenedorExample example);

    int updateByPrimaryKeySelective(Tps017Retenedor record);

    int updateByPrimaryKeyWithBLOBs(Tps017Retenedor record);

    int updateByPrimaryKey(Tps017Retenedor record);
}