package com.sky.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sky.dao.warehouse.WarehouseMapper;
import com.sky.dao.warehouse.WarehouseMapperCustom;
import com.sky.pojo.Warehouse;
import com.sky.pojo.WarehouseExample;

import junit.framework.TestCase;

public class WarehouseTest extends TestCase {

	private ApplicationContext applicationContext;
	private WarehouseMapperCustom whMapper;
	protected void setUp() throws Exception {
		// 获取spring容器
		applicationContext = new ClassPathXmlApplicationContext(new String[] {
				"applicationContext-*.xml"});
		whMapper = (WarehouseMapperCustom) applicationContext.getBean("whMapper");
	}
	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	public void getwh(){
		WarehouseExample whe=new WarehouseExample();
		WarehouseExample.Criteria criteria=whe.createCriteria();
		try {
			List<Warehouse> list=whMapper.getWarehouse(0, 1);
			System.out.println(list.get(1));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
