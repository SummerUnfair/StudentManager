package com.HG.service.impl;

import java.util.List;

import org.apache.log4j.Logger;

import com.HG.dao.UserDao;
import com.HG.dao.impl.UserDaoimpl;
import com.HG.pojo.User;
import com.HG.service.UserService;

public class UserServiceimpl implements UserService{

	//声明日志对象
	Logger logger=Logger.getLogger(UserServiceimpl.class);
	//声明DAO层对象
	UserDao ud=new UserDaoimpl();
	//service层里直接调Dao
	@Override
	public User checkUserLoginService(String uname, String pwd) {
		//打印日志
		logger.debug(uname+"发起了请求");
		User u=ud.checkUserLoginDao(uname, pwd);
		//判断
		if(u!=null) {
			logger.debug(uname+"登陆成功");
		}else {
			logger.debug(uname+"登陆失败");
		}
		
		return u;
	}
	
	//修改用户密码
	@Override
	public int userChangePwdService(String newPwd, int uid){
		logger.debug(uid+":发起密码请求");
		int index=ud.userChangePwdDao(newPwd,uid);
		if(index>0){ 
			logger.debug(uid+":密码修改成功");
		}else{ 
			logger.debug(uid+":密码修改失败");
		}
		return index;
	}

	//获取所有的用户信息
	@Override
	public List<User> userShowService() {
		List<User> lu=ud.userShowDao();
		logger.debug("显示所有用户信息："+lu);
		return ud.userShowDao();
	}

	//用户注册
	@Override
	public int userRegService(User u) {
		// TODO Auto-generated method stub
		return ud.userRegDao(u);
	}

	
	
}
