package com.sky.dao.counter;

import com.sky.pojo.Counter;
import com.sky.pojo.CounterExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CounterMapper {
    int countByExample(CounterExample example);

    int deleteByExample(CounterExample example);

    int deleteByPrimaryKey(Integer counterid);

    int insert(Counter record);

    int insertSelective(Counter record);

    List<Counter> selectByExample(CounterExample example);

    Counter selectByPrimaryKey(Integer counterid);

    int updateByExampleSelective(@Param("record") Counter record, @Param("example") CounterExample example);

    int updateByExample(@Param("record") Counter record, @Param("example") CounterExample example);

    int updateByPrimaryKeySelective(Counter record);

    int updateByPrimaryKey(Counter record);
}