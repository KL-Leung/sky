package com.sky.dao.storageaccount;

import com.sky.pojo.Storageaccount;
import com.sky.pojo.StorageaccountExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StorageaccountMapper {
    int countByExample(StorageaccountExample example);

    int deleteByExample(StorageaccountExample example);

    int deleteByPrimaryKey(String storageaccountid);

    int insert(Storageaccount record);

    int insertSelective(Storageaccount record);

    List<Storageaccount> selectByExample(StorageaccountExample example);

    Storageaccount selectByPrimaryKey(String storageaccountid);

    int updateByExampleSelective(@Param("record") Storageaccount record, @Param("example") StorageaccountExample example);

    int updateByExample(@Param("record") Storageaccount record, @Param("example") StorageaccountExample example);

    int updateByPrimaryKeySelective(Storageaccount record);

    int updateByPrimaryKey(Storageaccount record);
}