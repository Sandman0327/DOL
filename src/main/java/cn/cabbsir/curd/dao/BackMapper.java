package cn.cabbsir.curd.dao;

import cn.cabbsir.curd.bean.Back;
import cn.cabbsir.curd.bean.BackExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BackMapper {
    long countByExample(BackExample example);

    int deleteByExample(BackExample example);

    int deleteByPrimaryKey(Integer bid);

    int insert(Back record);

    int insertSelective(Back record);

    List<Back> selectByExample(BackExample example);

    Back selectByPrimaryKey(Integer bid);

    int updateByExampleSelective(@Param("record") Back record, @Param("example") BackExample example);

    int updateByExample(@Param("record") Back record, @Param("example") BackExample example);

    int updateByPrimaryKeySelective(Back record);

    int updateByPrimaryKey(Back record);
}