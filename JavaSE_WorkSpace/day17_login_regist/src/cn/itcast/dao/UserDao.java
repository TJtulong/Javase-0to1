package cn.itcast.dao;

import cn.itcast.pojo.User;

/**
 * 这是针对用户进行操作的接口
 * 
 * @author TJtulong
 * @version V1.0
 */
public interface UserDao {
	/**
	 * 用户登陆功能
	 * 
	 * @param username
	 * @param password
	 * @return
	 */
	public abstract boolean isLogin(String username, String password);

	/**
	 * 用户注册功能
	 * 
	 * @param user
	 */
	public abstract void regist(User user);
}
