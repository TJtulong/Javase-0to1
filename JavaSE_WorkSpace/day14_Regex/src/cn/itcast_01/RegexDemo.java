package cn.itcast_01;

import java.util.Scanner;

/*
 * 	У��qq���룺
 * 		Ҫ�����Ϊ5-15λ����
 * 		0���ܿ�ͷ
 */
public class RegexDemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("������QQ����");
		String qq=sc.nextLine();
		System.out.println(checkQQ(qq));
	}

	public static boolean checkQQ(String qq) {
		boolean flag = true;
		// У�鳤��
		if (qq.length() >= 5 && qq.length() <= 15) {
			// 0���ܿ�ͷ
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
