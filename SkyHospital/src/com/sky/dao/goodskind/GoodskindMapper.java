package com.sky.dao.goodskind;

import com.sky.pojo.Goodskind;
import com.sky.pojo.GoodskindExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodskindMapper {
    int countByExample(GoodskindExample example);

    int deleteByExample(GoodskindExample example);

    int deleteByPrimaryKey(Integer goodskindid);

    int insert(Goodskind record);

    int insertSelective(Goodskind record);

    List<Goodskind> selectByExample(GoodskindExample example);

    Goodskind selectByPrimaryKey(Integer goodskindid);

    int updateByExampleSelective(@Param("record") Goodskind record, @Param("example") GoodskindExample example);

    int updateByExample(@Param("record") Goodskind record, @Param("example") GoodskindExample example);

    int updateByPrimaryKeySelective(Goodskind record);

    int updateByPrimaryKey(Goodskind record);
}