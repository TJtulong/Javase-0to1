package cn.itcast.dao.impl;

import java.util.ArrayList;

import cn.itcast.dao.UserDao;
import cn.itcast.pojo.User;

/**
 * 这是用户操作的具体实现类(集合版)
 * 
 * @author TJtulong
 * @version V1.0
 *
 */
public class UserDaoImpl implements UserDao {
	//为了让多个成员变量公用一个变量,用static修饰
	private static ArrayList<User> array = new ArrayList<User>();

	@Override
	public boolean isLogin(String username, String password) {
		// 遍历集合,获取每一个用户,判断用户名和密码是否匹配
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
		// 把用户信息存入集合
		array.add(user);
	}

}
