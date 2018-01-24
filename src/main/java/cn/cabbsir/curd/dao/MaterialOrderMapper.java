package cn.cabbsir.curd.dao;

import cn.cabbsir.curd.bean.MaterialOrder;
import cn.cabbsir.curd.bean.MaterialOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MaterialOrderMapper {
    long countByExample(MaterialOrderExample example);

    int deleteByExample(MaterialOrderExample example);

    int deleteByPrimaryKey(Integer moid);

    int insert(MaterialOrder record);

    int insertSelective(MaterialOrder record);

    List<MaterialOrder> selectByExample(MaterialOrderExample example);

    MaterialOrder selectByPrimaryKey(Integer moid);

    int updateByExampleSelective(@Param("record") MaterialOrder record, @Param("example") MaterialOrderExample example);

    int updateByExample(@Param("record") MaterialOrder record, @Param("example") MaterialOrderExample example);

    int updateByPrimaryKeySelective(MaterialOrder record);

    int updateByPrimaryKey(MaterialOrder record);
}