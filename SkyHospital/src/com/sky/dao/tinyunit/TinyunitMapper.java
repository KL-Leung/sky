package com.sky.dao.tinyunit;

import com.sky.pojo.Tinyunit;
import com.sky.pojo.TinyunitExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TinyunitMapper {
    int countByExample(TinyunitExample example);

    int deleteByExample(TinyunitExample example);

    int deleteByPrimaryKey(Integer tinyunitid);

    int insert(Tinyunit record);

    int insertSelective(Tinyunit record);

    List<Tinyunit> selectByExample(TinyunitExample example);

    Tinyunit selectByPrimaryKey(Integer tinyunitid);

    int updateByExampleSelective(@Param("record") Tinyunit record, @Param("example") TinyunitExample example);

    int updateByExample(@Param("record") Tinyunit record, @Param("example") TinyunitExample example);

    int updateByPrimaryKeySelective(Tinyunit record);

    int updateByPrimaryKey(Tinyunit record);
}