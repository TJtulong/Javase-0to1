package cn.itcast_02;

import java.util.Scanner;

public class StringTest {
	public static void main(String[] args) {
		String username = "admin";
		String password = "admin";
		for (int x = 0; x < 3; x++) {
			Scanner sc = new Scanner(System.in);
			System.out.println("�������û���");
			String name = sc.nextLine();
			System.out.println("����������");
			String pwd = sc.nextLine();

			if (name.equals(username) && pwd.equals(password)) {
				System.out.println("��¼�ɹ�");
				break;
			} else {
				if (x != 2) {
					System.out.println("��¼ʧ��,�㻹��" + (2 - x) + "�λ���");
				} else {
					System.out.println("�˺ű�����");
				}
			}
		}
	}
}
