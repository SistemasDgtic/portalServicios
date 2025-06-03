package mx.sep.expedicion.dao;

import java.util.List;
import mx.sep.expedicion.modelo.Tps007Menus;
import mx.sep.expedicion.modelo.Tps007MenusExample;
import org.apache.ibatis.annotations.Param;

public interface Tps007MenusMapper {
    int countByExample(Tps007MenusExample example);

    int deleteByExample(Tps007MenusExample example);

    int deleteByPrimaryKey(Integer idOpcion);

    int insert(Tps007Menus record);

    int insertSelective(Tps007Menus record);

    List<Tps007Menus> selectByExample(Tps007MenusExample example);

    Tps007Menus selectByPrimaryKey(Integer idOpcion);

    int updateByExampleSelective(@Param("record") Tps007Menus record, @Param("example") Tps007MenusExample example);

    int updateByExample(@Param("record") Tps007Menus record, @Param("example") Tps007MenusExample example);

    int updateByPrimaryKeySelective(Tps007Menus record);

    int updateByPrimaryKey(Tps007Menus record);
}