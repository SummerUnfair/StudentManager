package com.HG.dao;

import com.HG.pojo.User;

import java.util.List;

public interface UserDao {

	//根据用户名和密码查询用户信息
	User checkUserLoginDao(String uname,String pwd);

	//根据用户ID修改用户密码的功能
	int userChangePwdDao(String newPwd, int uid);

	//获取所有的用户信息
	List<User> userShowDao();

	//用户注册
	int userRegDao(User u);

}
