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

		//�ַ�������Ǳ�����ӣ��ȿ��ռ䣬��ƴ��
		//�ַ�������ǳ�����ӣ���ƴ�ӣ����ڳ��������ң�����о�ֱ�ӷ��أ������ٴ���
	}

}