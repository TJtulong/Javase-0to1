package cn.itcast_01;

import java.util.Scanner;

/*
 * Scanner:���ڽ��ռ���¼�������
 * JDK5�����
 * 
 * System������һ����̬�ֶΣ�
 * 		public static final InputStream in;��׼������������Ӧ����¼��
 * 		InputStream is = System.in;
 * 
 * class Demo{
 * 		public static final int x = 10;
 * 		public static final Student s = new Student();
 * }
 * int y =  Demo.x
 * Student s = Demo.s;
 */
public class ScannerDemo {
	public static void main(String[] args) {
		// ��������
		Scanner sc = new Scanner(System.in);
		// Scanner�з������԰Ѽ���¼����ַ����Զ�ת����int double������
		int x = sc.nextInt();
		System.out.println("x=" + x);
		
	}
}
