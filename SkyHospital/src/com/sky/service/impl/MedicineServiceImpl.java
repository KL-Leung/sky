/**
 * 
 */
package com.sky.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sky.dao.medicine.MedicineMapper;
import com.sky.pojo.Medicine;
import com.sky.pojo.MedicineExample;
import com.sky.service.MedicineService;

/**
 * @author marr
 *
 */
@Service
public class MedicineServiceImpl implements MedicineService {

	@Resource
	private MedicineMapper medicineMapper;

	//查询药品
	public List<Medicine> selectByExample(MedicineExample example)
			throws Exception {
		// TODO Auto-generated method stub
		return medicineMapper.selectByExample(example);
	}

}
