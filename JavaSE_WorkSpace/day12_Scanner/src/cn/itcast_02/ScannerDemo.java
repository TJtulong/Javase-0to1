package cn.itcast_02;

import java.util.Scanner;

/*
 * 	������ʽ��
 *	public boolean hasNextXxx():�ж��Ƿ�Ϊĳ�����͵�Ԫ��
 *	public Xxx nextInt():��ȡ��Ԫ��ss
 *	������
 *	public boolean hasNextInt()
 *	public int nextInt()
 *	ע�⣺
 *	InputMismatchException ���������費ƥ��
 */
public class ScannerDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		if (sc.hasNextInt()) {
			int x = sc.nextInt();
			System.out.println("x=" + x);
		} else {
			System.out.println("������������");
		}
	}
}
