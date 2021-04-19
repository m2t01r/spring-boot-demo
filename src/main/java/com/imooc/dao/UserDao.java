package com.imooc.dao;

import com.imooc.entity.User;

/**
 * userDao user信息访问类
 * @author yuguangyuan
 *
 */
public interface UserDao {
	
	/**
	 * 通过用户名称获取用户信息
	 * @param userName
	 * @return
	 */
	User findUserByUserName(String userName);
}
