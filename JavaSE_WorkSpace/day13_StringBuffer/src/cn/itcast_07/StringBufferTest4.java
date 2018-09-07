package cn.itcast_07;

import java.util.Scanner;

//判断一个字符串是否是对称的
public class StringBufferTest4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个字符串");
		String s = sc.nextLine();
		System.out.println(isSame(s));
	}

	public static boolean isSame(String s) {
		StringBuffer sb = new StringBuffer(s);
		return sb.reverse().toString().equals(s);
	}
}
