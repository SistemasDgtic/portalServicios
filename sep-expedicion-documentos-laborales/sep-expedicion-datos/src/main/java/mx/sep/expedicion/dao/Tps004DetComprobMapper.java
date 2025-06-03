package mx.sep.expedicion.dao;

import java.util.List;
import mx.sep.expedicion.modelo.Tps004DetComprob;
import mx.sep.expedicion.modelo.Tps004DetComprobExample;
import org.apache.ibatis.annotations.Param;

public interface Tps004DetComprobMapper {
    int countByExample(Tps004DetComprobExample example);

    int deleteByExample(Tps004DetComprobExample example);

    int deleteByPrimaryKey(@Param("idComprobante") Integer idComprobante, @Param("consecutivo") Short consecutivo);

    int insert(Tps004DetComprob record);

    int insertSelective(Tps004DetComprob record);

    List<Tps004DetComprob> selectByExample(Tps004DetComprobExample example);

    Tps004DetComprob selectByPrimaryKey(@Param("idComprobante") Integer idComprobante, @Param("consecutivo") Short consecutivo);

    int updateByExampleSelective(@Param("record") Tps004DetComprob record, @Param("example") Tps004DetComprobExample example);

    int updateByExample(@Param("record") Tps004DetComprob record, @Param("example") Tps004DetComprobExample example);

    int updateByPrimaryKeySelective(Tps004DetComprob record);

    int updateByPrimaryKey(Tps004DetComprob record);
}