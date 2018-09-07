package cn.itcast_01;

import java.util.Scanner;

/*
 * 	校验qq号码：
 * 		要求必须为5-15位数字
 * 		0不能开头
 */
public class RegexDemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入QQ号码");
		String qq=sc.nextLine();
		System.out.println(checkQQ(qq));
	}

	public static boolean checkQQ(String qq) {
		boolean flag = true;
		// 校验长度
		if (qq.length() >= 5 && qq.length() <= 15) {
			// 0不能开头
			if (!qq.startsWith("0")) {
				char[] chs = qq.toCharArray();
				for (int x = 0; x < chs.length; x++) {
					char ch = chs[x];
					if (!Character.isDigit(ch)) {
						flag = false;
						break;
					}
				}
			} else {
				flag = false;
			}
		} else {
			flag = false;
		}
		return flag;
	}
}
