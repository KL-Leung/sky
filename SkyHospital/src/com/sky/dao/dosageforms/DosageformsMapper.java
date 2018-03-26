package com.sky.dao.dosageforms;

import com.sky.pojo.Dosageforms;
import com.sky.pojo.DosageformsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DosageformsMapper {
    int countByExample(DosageformsExample example);

    int deleteByExample(DosageformsExample example);

    int deleteByPrimaryKey(Integer dosageformsid);

    int insert(Dosageforms record);

    int insertSelective(Dosageforms record);

    List<Dosageforms> selectByExample(DosageformsExample example);

    Dosageforms selectByPrimaryKey(Integer dosageformsid);

    int updateByExampleSelective(@Param("record") Dosageforms record, @Param("example") DosageformsExample example);

    int updateByExample(@Param("record") Dosageforms record, @Param("example") DosageformsExample example);

    int updateByPrimaryKeySelective(Dosageforms record);

    int updateByPrimaryKey(Dosageforms record);
}