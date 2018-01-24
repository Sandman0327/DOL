package cn.cabbsir.curd.dao;

import cn.cabbsir.curd.bean.Sell;
import cn.cabbsir.curd.bean.SellExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SellMapper {
    long countByExample(SellExample example);

    int deleteByExample(SellExample example);

    int deleteByPrimaryKey(Integer seid);

    int insert(Sell record);

    int insertSelective(Sell record);

    List<Sell> selectByExample(SellExample example);

    Sell selectByPrimaryKey(Integer seid);

    int updateByExampleSelective(@Param("record") Sell record, @Param("example") SellExample example);

    int updateByExample(@Param("record") Sell record, @Param("example") SellExample example);

    int updateByPrimaryKeySelective(Sell record);

    int updateByPrimaryKey(Sell record);
}