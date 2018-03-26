package com.sky.dao.sellaccount;

import com.sky.pojo.Sellaccount;
import com.sky.pojo.SellaccountExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SellaccountMapper {
    int countByExample(SellaccountExample example);

    int deleteByExample(SellaccountExample example);

    int deleteByPrimaryKey(String sellaccountid);

    int insert(Sellaccount record);

    int insertSelective(Sellaccount record);

    List<Sellaccount> selectByExample(SellaccountExample example);

    Sellaccount selectByPrimaryKey(String sellaccountid);

    int updateByExampleSelective(@Param("record") Sellaccount record, @Param("example") SellaccountExample example);

    int updateByExample(@Param("record") Sellaccount record, @Param("example") SellaccountExample example);

    int updateByPrimaryKeySelective(Sellaccount record);

    int updateByPrimaryKey(Sellaccount record);
}