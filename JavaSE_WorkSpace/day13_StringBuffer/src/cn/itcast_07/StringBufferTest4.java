package cn.itcast_07;

import java.util.Scanner;

//�ж�һ���ַ����Ƿ��ǶԳƵ�
public class StringBufferTest4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ���ַ���");
		String s = sc.nextLine();
		System.out.println(isSame(s));
	}

	public static boolean isSame(String s) {
		StringBuffer sb = new StringBuffer(s);
		return sb.reverse().toString().equals(s);
	}
}
