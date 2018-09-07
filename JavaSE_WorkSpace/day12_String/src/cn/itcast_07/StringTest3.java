package cn.itcast_07;

import java.util.Scanner;

//字符串反转
public class StringTest3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个字符串");
		String s = sc.nextLine();
		String result="";
		char[] chs =s.toCharArray();
		for(int x=chs.length-1;x>=0;x--) {
			result+=chs[x];
		}
		System.out.println("反转后的结果是"+result);
	}
}
