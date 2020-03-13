package com.itheima.mybatis.junit;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.itheima.mybatis.dao.UserDaoImpl;
import com.itheima.mybatis.mapper.UserMapper;
import com.itheima.mybatis.pojo.User;

public class JunitTest {
	@Test
	public void testMapper() throws Exception {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserMapper mapper = ac.getBean(UserMapper.class);
//		UserMapper mapper = (UserMapper) ac.getBean("userMapper");
		User user = mapper.findUserById(10);
		System.out.println(user);
	}
	
	//传统Dao开发测试
	@Test
	public void testMapper_1() throws Exception {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserDaoImpl userDao = (UserDaoImpl) ac.getBean("userDao");
		User user1 = userDao.findUserById(10);
		System.out.println(user1);
	}
}
