package cn.itcast_03;

import java.util.Scanner;

/*
 *	���õ�����������
 *		public int nextInt():��ȡһ��int���͵���
 *		public String nextInt():��ȡһ��String���͵���
 *	���⣺
 *		�Ȼ�ȡ��ֵ�ٻ�ȡ�ַ������������
 *		��Ϊ�س����з��ŵ�����
 *	���������
 *		1.�Ȼ�ȡһ����ֵ���ڴ���һ���µļ���¼�����
 *  	2.�����е������Ȱ��ַ�����ȡ���ٰ�Ҫ��ת��
 */

public class ScannerDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// ��ȡ����int���͵�ֵ
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("a" + a + ",b" + b);

		// ��ȡ����String���͵�ֵ
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		System.out.println("s1" + s1 + ",s2" + s2);
		
		//�Ȼ�ȡһ���ַ������ٻ�ȡһ��int
		String s3 = sc.nextLine();
		int c = sc.nextInt();
		System.out.println("s3" + s3 + ",c" + c);
		
		//�Ȼ�ȡһ��intֵ���ٻ�ȡһ���ַ���
		String s4 = sc.nextLine();
		int d = sc.nextInt();
		System.out.println("s4" + s4 + ",d" + d);
		
	}
}
