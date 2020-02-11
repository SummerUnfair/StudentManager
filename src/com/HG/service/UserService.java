package com.HG.service;

import com.HG.pojo.User;

import java.util.List;
//业务逻辑和控制器解耦
public interface UserService {

	//校验用户登录
	User checkUserLoginService(String uname,String pwd);

	//修改用户密码
	int userChangePwdService(String newPwd, int uid);

	//获取所有的用户信息
	List<User> userShowService();

	//用户注册
	int userRegService(User u);
}
