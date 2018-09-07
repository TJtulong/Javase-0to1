package cn.itcast_01;

import java.util.Scanner;

/*
 * 	正则表达式:符合一定规则的字符串
 */
public class RegexDemo2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入QQ号码");
		String qq=sc.nextLine();
		System.out.println(checkQQ(qq));
	}

	public static boolean checkQQ(String qq) {
		/*String regex= "[1-9][0-9]{4,14}";
		//public boolean matches(String regex):告知次字符串是否匹配正则表达式
		boolean flag=qq.matches(regex);
		return flag;*/
		
		return qq.matches("[1-9][0-9]{4,14}");
	}
}
