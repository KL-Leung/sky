package com.sky.dao.mtiny;

import com.sky.pojo.Mtiny;
import com.sky.pojo.MtinyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MtinyMapper {
    int countByExample(MtinyExample example);

    int deleteByExample(MtinyExample example);

    int deleteByPrimaryKey(Integer mtid);

    int insert(Mtiny record);

    int insertSelective(Mtiny record);

    List<Mtiny> selectByExample(MtinyExample example);

    Mtiny selectByPrimaryKey(Integer mtid);

    int updateByExampleSelective(@Param("record") Mtiny record, @Param("example") MtinyExample example);

    int updateByExample(@Param("record") Mtiny record, @Param("example") MtinyExample example);

    int updateByPrimaryKeySelective(Mtiny record);

    int updateByPrimaryKey(Mtiny record);
}