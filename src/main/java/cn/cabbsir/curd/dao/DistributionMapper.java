package cn.cabbsir.curd.dao;

import cn.cabbsir.curd.bean.Distribution;
import cn.cabbsir.curd.bean.DistributionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DistributionMapper {
    long countByExample(DistributionExample example);

    int deleteByExample(DistributionExample example);

    int deleteByPrimaryKey(Integer did);

    int insert(Distribution record);

    int insertSelective(Distribution record);

    List<Distribution> selectByExample(DistributionExample example);

    Distribution selectByPrimaryKey(Integer did);

    int updateByExampleSelective(@Param("record") Distribution record, @Param("example") DistributionExample example);

    int updateByExample(@Param("record") Distribution record, @Param("example") DistributionExample example);

    int updateByPrimaryKeySelective(Distribution record);

    int updateByPrimaryKey(Distribution record);
}