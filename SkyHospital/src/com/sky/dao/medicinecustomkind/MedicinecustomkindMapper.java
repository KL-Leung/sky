package com.sky.dao.medicinecustomkind;

import com.sky.pojo.Medicinecustomkind;
import com.sky.pojo.MedicinecustomkindExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MedicinecustomkindMapper {
    int countByExample(MedicinecustomkindExample example);

    int deleteByExample(MedicinecustomkindExample example);

    int deleteByPrimaryKey(Integer mckid);

    int insert(Medicinecustomkind record);

    int insertSelective(Medicinecustomkind record);

    List<Medicinecustomkind> selectByExampleWithBLOBs(MedicinecustomkindExample example);

    List<Medicinecustomkind> selectByExample(MedicinecustomkindExample example);

    Medicinecustomkind selectByPrimaryKey(Integer mckid);

    int updateByExampleSelective(@Param("record") Medicinecustomkind record, @Param("example") MedicinecustomkindExample example);

    int updateByExampleWithBLOBs(@Param("record") Medicinecustomkind record, @Param("example") MedicinecustomkindExample example);

    int updateByExample(@Param("record") Medicinecustomkind record, @Param("example") MedicinecustomkindExample example);

    int updateByPrimaryKeySelective(Medicinecustomkind record);

    int updateByPrimaryKeyWithBLOBs(Medicinecustomkind record);
}