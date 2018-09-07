package cn.itcast_01;

import java.util.Scanner;

/*
 * Scanner:用于接收键盘录入的数据
 * JDK5后出现
 * 
 * System类下有一个静态字段：
 * 		public static final InputStream in;标准的输入流，对应键盘录入
 * 		InputStream is = System.in;
 * 
 * class Demo{
 * 		public static final int x = 10;
 * 		public static final Student s = new Student();
 * }
 * int y =  Demo.x
 * Student s = Demo.s;
 */
public class ScannerDemo {
	public static void main(String[] args) {
		// 创建对象
		Scanner sc = new Scanner(System.in);
		// Scanner中方法可以把键盘录入的字符串自动转换成int double等类型
		int x = sc.nextInt();
		System.out.println("x=" + x);
		
	}
}
