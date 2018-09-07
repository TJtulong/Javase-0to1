package cn.itcast_01;

import java.net.StandardSocketOptions;

public class StringDemo3 {
	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "world";
		String s3 = "helloworld";
		System.out.println(s3 == s1 + s2);// false
		System.out.println(s3.equals(s1 + s2));// true
		System.out.println(s3 == "hello" + "world");// true
		System.out.println(s3.equals("hello" + "world"));// true

		//字符串如果是变量相加，先开空间，再拼接
		//字符串如果是常量相加，先拼接，再在常量池中找，如果有就直接返回，否则再创建
	}

}
