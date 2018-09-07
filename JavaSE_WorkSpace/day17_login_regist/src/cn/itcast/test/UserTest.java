package cn.itcast.test;

import java.util.Scanner;

import cn.itcast.dao.UserDao;
import cn.itcast.dao.impl.UserDaoImpl;
import cn.itcast.game.GuessGame;
import cn.itcast.pojo.User;

/**
 * 用户测试类
 * 
 * @author TJtulong
 * @version V1.0
 *
 */
public class UserTest {
	public static void main(String[] args) {
		while (true) {
			System.out.println("--------------欢迎光临--------------");
			System.out.println("1 登陆");
			System.out.println("2 注册");
			System.out.println("3 退出");
			System.out.println("请输入你的选择：");

			Scanner sc = new Scanner(System.in);
			String choiceString = sc.nextLine();
			// 调用注册功能
			UserDao ud = new UserDaoImpl();
			switch (choiceString) {
			case "1":
				System.out.println("--------------欢迎登录--------------");
				System.out.println("请输入用户名");
				String username = sc.nextLine();
				System.out.println("请输入密码");
				String password = sc.nextLine();

				boolean flag = ud.isLogin(username, password);
				if (flag) {
					System.out.println("登录成功");
					GuessGame.start();
					System.exit(0);
				} else {
					System.out.println("用户名或密码有误,登陆失败");
				}

				break;
			case "2":
				System.out.println("--------------注册界面--------------");
				System.out.println("请输入用户名");
				String newUsername = sc.nextLine();
				System.out.println("请输入密码");
				String newPassword = sc.nextLine();

				User user = new User();
				user.setName(newUsername);
				user.setPassword(newPassword);
				ud.regist(user);
				break;
			case "3":
			default:
				System.out.println("欢迎使用");
				break;
			}
		}
	}
}
