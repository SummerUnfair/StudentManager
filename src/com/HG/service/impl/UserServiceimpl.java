package com.HG.service.impl;

import java.util.List;

import org.apache.log4j.Logger;

import com.HG.dao.UserDao;
import com.HG.dao.impl.UserDaoimpl;
import com.HG.pojo.User;
import com.HG.service.UserService;

public class UserServiceimpl implements UserService{

	//������־����
	Logger logger=Logger.getLogger(UserServiceimpl.class);
	//����DAO�����
	UserDao ud=new UserDaoimpl();
	//service����ֱ�ӵ�Dao
	@Override
	public User checkUserLoginService(String uname, String pwd) {
		//��ӡ��־
		logger.debug(uname+"����������");
		User u=ud.checkUserLoginDao(uname, pwd);
		//�ж�
		if(u!=null) {
			logger.debug(uname+"��½�ɹ�");
		}else {
			logger.debug(uname+"��½ʧ��");
		}
		
		return u;
	}
	
	//�޸��û�����
	@Override
	public int userChangePwdService(String newPwd, int uid){
		logger.debug(uid+":������������");
		int index=ud.userChangePwdDao(newPwd,uid);
		if(index>0){ 
			logger.debug(uid+":�����޸ĳɹ�");
		}else{ 
			logger.debug(uid+":�����޸�ʧ��");
		}
		return index;
	}

	//��ȡ���е��û���Ϣ
	@Override
	public List<User> userShowService() {
		List<User> lu=ud.userShowDao();
		logger.debug("��ʾ�����û���Ϣ��"+lu);
		return ud.userShowDao();
	}

	//�û�ע��
	@Override
	public int userRegService(User u) {
		// TODO Auto-generated method stub
		return ud.userRegDao(u);
	}

	
	
}
