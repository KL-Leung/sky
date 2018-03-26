package com.sky.dao.goodsallocation;

import com.sky.pojo.Goodsallocation;
import com.sky.pojo.GoodsallocationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsallocationMapper {
    int countByExample(GoodsallocationExample example);

    int deleteByExample(GoodsallocationExample example);

    int deleteByPrimaryKey(Integer gaid);

    int insert(Goodsallocation record);

    int insertSelective(Goodsallocation record);

    List<Goodsallocation> selectByExample(GoodsallocationExample example);

    Goodsallocation selectByPrimaryKey(Integer gaid);

    int updateByExampleSelective(@Param("record") Goodsallocation record, @Param("example") GoodsallocationExample example);

    int updateByExample(@Param("record") Goodsallocation record, @Param("example") GoodsallocationExample example);

    int updateByPrimaryKeySelective(Goodsallocation record);

    int updateByPrimaryKey(Goodsallocation record);
}