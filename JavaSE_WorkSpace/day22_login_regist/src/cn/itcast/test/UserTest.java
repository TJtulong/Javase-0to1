package cn.itcast.test;

import java.util.Scanner;

import cn.itcast.dao.UserDao;
import cn.itcast.dao.impl.UserDaoImpl;
import cn.itcast.game.GuessGame;
import cn.itcast.pojo.User;

/**
 * �û�������
 * 
 * @author TJtulong
 * @version V1.0
 *
 */
public class UserTest {
	public static void main(String[] args) {
		while (true) {
			System.out.println("--------------��ӭ����--------------");
			System.out.println("1 ��½");
			System.out.println("2 ע��");
			System.out.println("3 �˳�");
			System.out.println("���������ѡ��");

			Scanner sc = new Scanner(System.in);
			String choiceString = sc.nextLine();
			// ����ע�Ṧ��
			UserDao ud = new UserDaoImpl();
			switch (choiceString) {
			case "1":
				System.out.println("--------------��ӭ��¼--------------");
				System.out.println("�������û���");
				String username = sc.nextLine();
				System.out.println("����������");
				String password = sc.nextLine();

				boolean flag = ud.isLogin(username, password);
				if (flag) {
					System.out.println("��¼�ɹ�");
					GuessGame.start();
					System.exit(0);
				} else {
					System.out.println("�û�������������,��½ʧ��");
				}

				break;
			case "2":
				System.out.println("--------------ע�����--------------");
				System.out.println("�������û���");
				String newUsername = sc.nextLine();
				System.out.println("����������");
				String newPassword = sc.nextLine();

				User user = new User();
				user.setName(newUsername);
				user.setPassword(newPassword);
				ud.regist(user);
				break;
			case "3":
			default:
				System.out.println("��ӭʹ��");
				break;
			}
		}
	}
}
