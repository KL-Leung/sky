package com.sky.service;

import java.util.List;

import com.sky.pojo.Medicine;
import com.sky.pojo.MedicineExample;



public interface MedicineService {
	
	//查询药品
	public List<Medicine> selectByExample(MedicineExample example) throws Exception;

}
