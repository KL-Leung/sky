package com.sky.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.sky.dao.warehouse.WarehouseMapperCustom;
import com.sky.pojo.Warehouse;
import com.sky.service.WarehouseService;

@Service
public class WarehouseServiceImpl implements WarehouseService {

	@Resource
	private WarehouseMapperCustom whMapperCustom;
	
	public List<Warehouse> getWarehouse(Integer currentPageNo, Integer pageSize)
			throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
