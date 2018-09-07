package cn.itcast.dao;

import cn.itcast.pojo.User;

/**
 * ��������û����в����Ľӿ�
 * 
 * @author TJtulong
 * @version V1.0
 */
public interface UserDao {
	/**
	 * �û���½����
	 * 
	 * @param username
	 * @param password
	 * @return
	 */
	public abstract boolean isLogin(String username, String password);

	/**
	 * �û�ע�Ṧ��
	 * 
	 * @param user
	 */
	public abstract void regist(User user);
}
