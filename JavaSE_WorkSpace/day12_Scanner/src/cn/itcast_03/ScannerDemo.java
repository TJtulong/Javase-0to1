package cn.itcast_03;

import java.util.Scanner;

/*
 *	常用的两个方法：
 *		public int nextInt():获取一个int类型的数
 *		public String nextInt():获取一个String类型的数
 *	问题：
 *		先获取数值再获取字符串会出现问题
 *		因为回车换行符号的问题
 *	解决方法：
 *		1.先获取一个数值后，在创建一个新的键盘录入对象
 *  	2.把所有的数据先按字符串获取，再按要求转换
 */

public class ScannerDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 获取两个int类型的值
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("a" + a + ",b" + b);

		// 获取两个String类型的值
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		System.out.println("s1" + s1 + ",s2" + s2);
		
		//先获取一个字符串，再获取一个int
		String s3 = sc.nextLine();
		int c = sc.nextInt();
		System.out.println("s3" + s3 + ",c" + c);
		
		//先获取一个int值，再获取一个字符串
		String s4 = sc.nextLine();
		int d = sc.nextInt();
		System.out.println("s4" + s4 + ",d" + d);
		
	}
}
