package cn.itcast_02;

import java.util.Scanner;

/*
 * 	�жϹ��� matches
 * 	�ж��ֻ������Ƿ���Ϲ���
 */
public class RegexDemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("�������ֻ�����");
		String phone=sc.nextLine();
		
		String regex="1[38]\\d{9}";
		System.out.println(phone.matches(regex));
	}
}
