package cn.itcast_07;

import java.util.Scanner;

//�ַ�����ת
public class StringTest3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ���ַ���");
		String s = sc.nextLine();
		String result="";
		char[] chs =s.toCharArray();
		for(int x=chs.length-1;x>=0;x--) {
			result+=chs[x];
		}
		System.out.println("��ת��Ľ����"+result);
	}
}
