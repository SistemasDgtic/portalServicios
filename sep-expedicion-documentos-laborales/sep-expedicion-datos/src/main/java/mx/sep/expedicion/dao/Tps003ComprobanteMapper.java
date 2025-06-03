package mx.sep.expedicion.dao;

import java.util.List;
import mx.sep.expedicion.modelo.Tps003Comprobante;
import mx.sep.expedicion.modelo.Tps003ComprobanteExample;
import org.apache.ibatis.annotations.Param;

public interface Tps003ComprobanteMapper {
    int countByExample(Tps003ComprobanteExample example);

    int deleteByExample(Tps003ComprobanteExample example);

    int deleteByPrimaryKey(Integer idComprobante);

    int insert(Tps003Comprobante record);

    int insertSelective(Tps003Comprobante record);

    List<Tps003Comprobante> selectByExample(Tps003ComprobanteExample example);

    Tps003Comprobante selectByPrimaryKey(Integer idComprobante);

    int updateByExampleSelective(@Param("record") Tps003Comprobante record, @Param("example") Tps003ComprobanteExample example);

    int updateByExample(@Param("record") Tps003Comprobante record, @Param("example") Tps003ComprobanteExample example);

    int updateByPrimaryKeySelective(Tps003Comprobante record);

    int updateByPrimaryKey(Tps003Comprobante record);
}