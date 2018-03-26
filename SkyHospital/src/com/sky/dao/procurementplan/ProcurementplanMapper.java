package com.sky.dao.procurementplan;

import com.sky.pojo.Procurementplan;
import com.sky.pojo.ProcurementplanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProcurementplanMapper {
    int countByExample(ProcurementplanExample example);

    int deleteByExample(ProcurementplanExample example);

    int deleteByPrimaryKey(Integer ppid);

    int insert(Procurementplan record);

    int insertSelective(Procurementplan record);

    List<Procurementplan> selectByExample(ProcurementplanExample example);

    Procurementplan selectByPrimaryKey(Integer ppid);

    int updateByExampleSelective(@Param("record") Procurementplan record, @Param("example") ProcurementplanExample example);

    int updateByExample(@Param("record") Procurementplan record, @Param("example") ProcurementplanExample example);

    int updateByPrimaryKeySelective(Procurementplan record);

    int updateByPrimaryKey(Procurementplan record);
}