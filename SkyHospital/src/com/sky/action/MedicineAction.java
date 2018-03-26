package com.sky.action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sky.pojo.Medicine;
import com.sky.pojo.MedicineExample;
import com.sky.service.MedicineService;

/**
 * 药品表视图
 * @author marr
 *
 */
@Controller
@RequestMapping(value="/medicine",method = RequestMethod.GET)
public class MedicineAction {
	@Resource
	private MedicineService medicineService;
	
	//获取所有信息
	@RequestMapping(value="/getMedicineList")
	public String getMedicineList(Model model){
		List<Medicine> list=null;
		try {
			list= medicineService.selectByExample(new MedicineExample());
			model.addAttribute("list", list);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "CheckStorage";
	}

}
