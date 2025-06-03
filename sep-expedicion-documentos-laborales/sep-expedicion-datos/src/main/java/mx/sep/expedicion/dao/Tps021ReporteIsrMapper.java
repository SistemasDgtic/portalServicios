package mx.sep.expedicion.dao;

import java.util.List;
import mx.sep.expedicion.modelo.Tps021ReporteIsr;
import mx.sep.expedicion.modelo.Tps021ReporteIsrExample;
import org.apache.ibatis.annotations.Param;

public interface Tps021ReporteIsrMapper {
    int countByExample(Tps021ReporteIsrExample example);

    int deleteByExample(Tps021ReporteIsrExample example);

    int deleteByPrimaryKey(Integer idRepIsr);

    int insert(Tps021ReporteIsr record);

    int insertSelective(Tps021ReporteIsr record);

    List<Tps021ReporteIsr> selectByExample(Tps021ReporteIsrExample example);

    Tps021ReporteIsr selectByPrimaryKey(Integer idRepIsr);

    int updateByExampleSelective(@Param("record") Tps021ReporteIsr record, @Param("example") Tps021ReporteIsrExample example);

    int updateByExample(@Param("record") Tps021ReporteIsr record, @Param("example") Tps021ReporteIsrExample example);

    int updateByPrimaryKeySelective(Tps021ReporteIsr record);

    int updateByPrimaryKey(Tps021ReporteIsr record);
}