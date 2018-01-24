package cn.cabbsir.curd.dao;

import cn.cabbsir.curd.bean.CompanyInventory;
import cn.cabbsir.curd.bean.CompanyInventoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CompanyInventoryMapper {
    long countByExample(CompanyInventoryExample example);

    int deleteByExample(CompanyInventoryExample example);

    int deleteByPrimaryKey(Integer ciid);

    int insert(CompanyInventory record);

    int insertSelective(CompanyInventory record);

    List<CompanyInventory> selectByExample(CompanyInventoryExample example);

    CompanyInventory selectByPrimaryKey(Integer ciid);

    int updateByExampleSelective(@Param("record") CompanyInventory record, @Param("example") CompanyInventoryExample example);

    int updateByExample(@Param("record") CompanyInventory record, @Param("example") CompanyInventoryExample example);

    int updateByPrimaryKeySelective(CompanyInventory record);

    int updateByPrimaryKey(CompanyInventory record);
}