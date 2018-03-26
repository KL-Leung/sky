package com.sky.dao.sellitem;

import com.sky.pojo.Sellitem;
import com.sky.pojo.SellitemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SellitemMapper {
    int countByExample(SellitemExample example);

    int deleteByExample(SellitemExample example);

    int deleteByPrimaryKey(Integer sellitem);

    int insert(Sellitem record);

    int insertSelective(Sellitem record);

    List<Sellitem> selectByExample(SellitemExample example);

    Sellitem selectByPrimaryKey(Integer sellitem);

    int updateByExampleSelective(@Param("record") Sellitem record, @Param("example") SellitemExample example);

    int updateByExample(@Param("record") Sellitem record, @Param("example") SellitemExample example);

    int updateByPrimaryKeySelective(Sellitem record);

    int updateByPrimaryKey(Sellitem record);
}