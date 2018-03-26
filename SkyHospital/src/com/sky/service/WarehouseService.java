package com.sky.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.sky.pojo.Warehouse;

public interface WarehouseService {

	public  List<Warehouse> getWarehouse(Integer currentPageNo,Integer pageSize) throws Exception ;
}
