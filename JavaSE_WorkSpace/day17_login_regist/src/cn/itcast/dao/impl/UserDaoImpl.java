package cn.itcast.dao.impl;

import java.util.ArrayList;

import cn.itcast.dao.UserDao;
import cn.itcast.pojo.User;

/**
 * �����û������ľ���ʵ����(���ϰ�)
 * 
 * @author TJtulong
 * @version V1.0
 *
 */
public class UserDaoImpl implements UserDao {
	//Ϊ���ö����Ա��������һ������,��static����
	private static ArrayList<User> array = new ArrayList<User>();

	@Override
	public boolean isLogin(String username, String password) {
		// ��������,��ȡÿһ���û�,�ж��û����������Ƿ�ƥ��
		boolean flag = false;
		for (User u : array) {
			if (u.getName().equals(username) && u.getPassword().equals(password)) {
				flag = true;
				break;
			}
		}
		return flag;
	}

	@Override
	public void regist(User user) {
		// ���û���Ϣ���뼯��
		array.add(user);
	}

}
