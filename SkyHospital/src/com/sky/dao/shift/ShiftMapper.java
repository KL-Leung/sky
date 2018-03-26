package com.sky.dao.shift;

import com.sky.pojo.Shift;
import com.sky.pojo.ShiftExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShiftMapper {
    int countByExample(ShiftExample example);

    int deleteByExample(ShiftExample example);

    int deleteByPrimaryKey(Integer shiftid);

    int insert(Shift record);

    int insertSelective(Shift record);

    List<Shift> selectByExample(ShiftExample example);

    Shift selectByPrimaryKey(Integer shiftid);

    int updateByExampleSelective(@Param("record") Shift record, @Param("example") ShiftExample example);

    int updateByExample(@Param("record") Shift record, @Param("example") ShiftExample example);

    int updateByPrimaryKeySelective(Shift record);

    int updateByPrimaryKey(Shift record);
}