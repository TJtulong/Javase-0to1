package cn.itcast_07;

import java.util.Scanner;

public class StringBufferTest3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ÇëÊäÈë×Ö·û´®");
		String s=sc.nextLine();
		String s1=myreverse(s);
		System.out.println(s1);
	}

	public static String myreverse(String s) {
		return new StringBuffer(s).reverse().toString();
	}
}
