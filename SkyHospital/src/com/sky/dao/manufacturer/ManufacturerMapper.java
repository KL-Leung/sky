package com.sky.dao.manufacturer;

import com.sky.pojo.Manufacturer;
import com.sky.pojo.ManufacturerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ManufacturerMapper {
    int countByExample(ManufacturerExample example);

    int deleteByExample(ManufacturerExample example);

    int deleteByPrimaryKey(Integer manufacturerid);

    int insert(Manufacturer record);

    int insertSelective(Manufacturer record);

    List<Manufacturer> selectByExample(ManufacturerExample example);

    Manufacturer selectByPrimaryKey(Integer manufacturerid);

    int updateByExampleSelective(@Param("record") Manufacturer record, @Param("example") ManufacturerExample example);

    int updateByExample(@Param("record") Manufacturer record, @Param("example") ManufacturerExample example);

    int updateByPrimaryKeySelective(Manufacturer record);

    int updateByPrimaryKey(Manufacturer record);
}