package cn.cabbsir.curd.dao;

import cn.cabbsir.curd.bean.Production;
import cn.cabbsir.curd.bean.ProductionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductionMapper {
    long countByExample(ProductionExample example);

    int deleteByExample(ProductionExample example);

    int deleteByPrimaryKey(Integer poid);

    int insert(Production record);

    int insertSelective(Production record);

    List<Production> selectByExample(ProductionExample example);

    Production selectByPrimaryKey(Integer poid);

    int updateByExampleSelective(@Param("record") Production record, @Param("example") ProductionExample example);

    int updateByExample(@Param("record") Production record, @Param("example") ProductionExample example);

    int updateByPrimaryKeySelective(Production record);

    int updateByPrimaryKey(Production record);
}