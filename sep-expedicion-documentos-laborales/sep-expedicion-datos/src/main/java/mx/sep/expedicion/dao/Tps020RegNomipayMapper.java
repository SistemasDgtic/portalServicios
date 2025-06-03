package mx.sep.expedicion.dao;

import java.util.List;
import mx.sep.expedicion.modelo.Tps020RegNomipay;
import mx.sep.expedicion.modelo.Tps020RegNomipayExample;
import org.apache.ibatis.annotations.Param;

public interface Tps020RegNomipayMapper {
    int countByExample(Tps020RegNomipayExample example);

    int deleteByExample(Tps020RegNomipayExample example);

    int deleteByPrimaryKey(Integer idRegistro);

    int insert(Tps020RegNomipay record);

    int insertSelective(Tps020RegNomipay record);

    List<Tps020RegNomipay> selectByExample(Tps020RegNomipayExample example);

    Tps020RegNomipay selectByPrimaryKey(Integer idRegistro);

    int updateByExampleSelective(@Param("record") Tps020RegNomipay record, @Param("example") Tps020RegNomipayExample example);

    int updateByExample(@Param("record") Tps020RegNomipay record, @Param("example") Tps020RegNomipayExample example);

    int updateByPrimaryKeySelective(Tps020RegNomipay record);

    int updateByPrimaryKey(Tps020RegNomipay record);
}