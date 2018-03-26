package com.sky.test;

import java.util.List;

import junit.framework.TestCase;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sky.dao.medicine.MedicineMapper;
import com.sky.pojo.Medicine;
import com.sky.pojo.MedicineExample;



public class MedicineTest {
	public static void main(String[] args) {
		ApplicationContext applicationContext;
		MedicineMapper medicineMapper;

		applicationContext = new ClassPathXmlApplicationContext(
				new String[] { "applicationContext-*.xml" });
		medicineMapper = (MedicineMapper) applicationContext
				.getBean("medicineMapper");
		int i = medicineMapper.countByExample(new MedicineExample());
		System.out.println("数据："+i);
		List<Medicine> list= medicineMapper.selectByExample(new MedicineExample());
		System.out.println("药品Id:"+"\t"+"药品名称"+"\t\t"+"药品规格");
		for(Medicine m:list){
			System.out.println(m.getMedicineid()+"\t"+m.getMedicinename()+"\t\t"+m.getSpecification());
		}
		System.out.println("正常");
		
	}

}
