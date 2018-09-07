package cn.itcast_02;

import java.util.Scanner;

public class StringTest {
	public static void main(String[] args) {
		String username = "admin";
		String password = "admin";
		for (int x = 0; x < 3; x++) {
			Scanner sc = new Scanner(System.in);
			System.out.println("请输入用户名");
			String name = sc.nextLine();
			System.out.println("请输入密码");
			String pwd = sc.nextLine();

			if (name.equals(username) && pwd.equals(password)) {
				System.out.println("登录成功");
				break;
			} else {
				if (x != 2) {
					System.out.println("登录失败,你还有" + (2 - x) + "次机会");
				} else {
					System.out.println("账号被冻结");
				}
			}
		}
	}
}
