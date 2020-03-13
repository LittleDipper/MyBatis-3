	package com.itheima.mybatis.dao;
	
	import org.mybatis.spring.support.SqlSessionDaoSupport;
	
	import com.itheima.mybatis.pojo.User;
	
	/**
	 * 原始Dao开发
	 */
	public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao{
	
		//声明工厂(此处已经继承了SqlSessionDaoSupport，就不用再声明工厂了)
		public User findUserById(Integer id){
			User user = this.getSqlSession().selectOne("findUserById", 10);
			return user;
		}
	}
