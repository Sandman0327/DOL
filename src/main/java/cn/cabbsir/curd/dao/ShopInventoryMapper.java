package cn.cabbsir.curd.dao;

import cn.cabbsir.curd.bean.ShopInventory;
import cn.cabbsir.curd.bean.ShopInventoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShopInventoryMapper {
    long countByExample(ShopInventoryExample example);

    int deleteByExample(ShopInventoryExample example);

    int deleteByPrimaryKey(Integer siid);

    int insert(ShopInventory record);

    int insertSelective(ShopInventory record);

    List<ShopInventory> selectByExample(ShopInventoryExample example);

    ShopInventory selectByPrimaryKey(Integer siid);

    int updateByExampleSelective(@Param("record") ShopInventory record, @Param("example") ShopInventoryExample example);

    int updateByExample(@Param("record") ShopInventory record, @Param("example") ShopInventoryExample example);

    int updateByPrimaryKeySelective(ShopInventory record);

    int updateByPrimaryKey(ShopInventory record);
}