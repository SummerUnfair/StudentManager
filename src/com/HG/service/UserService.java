package com.HG.service;

import com.HG.pojo.User;

import java.util.List;
//ҵ���߼��Ϳ���������
public interface UserService {

	//У���û���¼
	User checkUserLoginService(String uname,String pwd);

	//�޸��û�����
	int userChangePwdService(String newPwd, int uid);

	//��ȡ���е��û���Ϣ
	List<User> userShowService();

	//�û�ע��
	int userRegService(User u);
}
