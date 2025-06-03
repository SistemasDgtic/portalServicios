package mx.sep.expedicion.dao;

import java.util.List;
import mx.sep.expedicion.modelo.Tps016DetalleIsr;
import mx.sep.expedicion.modelo.Tps016DetalleIsrExample;
import org.apache.ibatis.annotations.Param;

public interface Tps016DetalleIsrMapper {
    int countByExample(Tps016DetalleIsrExample example);

    int deleteByExample(Tps016DetalleIsrExample example);

    int deleteByPrimaryKey(@Param("idConstancia") Integer idConstancia, @Param("clave") Short clave);

    int insert(Tps016DetalleIsr record);

    int insertSelective(Tps016DetalleIsr record);

    List<Tps016DetalleIsr> selectByExample(Tps016DetalleIsrExample example);

    Tps016DetalleIsr selectByPrimaryKey(@Param("idConstancia") Integer idConstancia, @Param("clave") Short clave);

    int updateByExampleSelective(@Param("record") Tps016DetalleIsr record, @Param("example") Tps016DetalleIsrExample example);

    int updateByExample(@Param("record") Tps016DetalleIsr record, @Param("example") Tps016DetalleIsrExample example);

    int updateByPrimaryKeySelective(Tps016DetalleIsr record);

    int updateByPrimaryKey(Tps016DetalleIsr record);
}