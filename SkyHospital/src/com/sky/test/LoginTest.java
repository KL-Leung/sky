package com.sky.test;

/**
 * 用户测试类
 */

import junit.framework.TestCase;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sky.dao.user.UserMapper;
import com.sky.pojo.UserExample;

public class LoginTest {
	public static void main(String[] args) {
		 ApplicationContext applicationContext;
		 UserMapper userMapper;
		applicationContext = new ClassPathXmlApplicationContext(
				new String[] { "applicationContext-*.xml" });
		userMapper = (UserMapper) applicationContext.getBean("userMapper");
		// 根据主键查询用户信息
		// User user = userMapper.selectByPrimaryKey("1");

		int i = userMapper.countByExample(new UserExample());
		System.out.println(i);
		// System.out.println(user.getUname());
	}

	public void testSelectByPrimaryKey() {

	}

}
