package cn.itcast_02;

import java.util.Scanner;

/*
 * 	判断功能 matches
 * 	判断手机号码是否符合规则
 */
public class RegexDemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入手机号码");
		String phone=sc.nextLine();
		
		String regex="1[38]\\d{9}";
		System.out.println(phone.matches(regex));
	}
}
