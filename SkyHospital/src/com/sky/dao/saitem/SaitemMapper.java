package com.sky.dao.saitem;

import com.sky.pojo.Saitem;
import com.sky.pojo.SaitemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SaitemMapper {
    int countByExample(SaitemExample example);

    int deleteByExample(SaitemExample example);

    int deleteByPrimaryKey(Integer saitemid);

    int insert(Saitem record);

    int insertSelective(Saitem record);

    List<Saitem> selectByExample(SaitemExample example);

    Saitem selectByPrimaryKey(Integer saitemid);

    int updateByExampleSelective(@Param("record") Saitem record, @Param("example") SaitemExample example);

    int updateByExample(@Param("record") Saitem record, @Param("example") SaitemExample example);

    int updateByPrimaryKeySelective(Saitem record);

    int updateByPrimaryKey(Saitem record);
}