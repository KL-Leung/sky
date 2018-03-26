package com.sky.dao.warehouse;

import com.sky.pojo.Warehouse;
import com.sky.pojo.WarehouseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WarehouseMapperCustom {


	public  List<Warehouse> getWarehouse(@Param("currentPageNo") Integer currentPageNo,@Param("pageSize") Integer pageSize) throws Exception;

}