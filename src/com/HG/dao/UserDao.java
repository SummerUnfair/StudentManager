package com.HG.dao;

import com.HG.pojo.User;

import java.util.List;

public interface UserDao {

	//�����û����������ѯ�û���Ϣ
	User checkUserLoginDao(String uname,String pwd);

	//�����û�ID�޸��û�����Ĺ���
	int userChangePwdDao(String newPwd, int uid);

	//��ȡ���е��û���Ϣ
	List<User> userShowDao();

	//�û�ע��
	int userRegDao(User u);

}
