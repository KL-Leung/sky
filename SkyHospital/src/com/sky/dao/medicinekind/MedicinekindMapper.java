package com.sky.dao.medicinekind;

import com.sky.pojo.Medicinekind;
import com.sky.pojo.MedicinekindExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MedicinekindMapper {
    int countByExample(MedicinekindExample example);

    int deleteByExample(MedicinekindExample example);

    int deleteByPrimaryKey(Integer medicinekindid);

    int insert(Medicinekind record);

    int insertSelective(Medicinekind record);

    List<Medicinekind> selectByExample(MedicinekindExample example);

    Medicinekind selectByPrimaryKey(Integer medicinekindid);

    int updateByExampleSelective(@Param("record") Medicinekind record, @Param("example") MedicinekindExample example);

    int updateByExample(@Param("record") Medicinekind record, @Param("example") MedicinekindExample example);

    int updateByPrimaryKeySelective(Medicinekind record);

    int updateByPrimaryKey(Medicinekind record);
}