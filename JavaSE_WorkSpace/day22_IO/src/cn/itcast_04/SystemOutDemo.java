package cn.itcast_04;

import java.io.PrintStream;

/*
 * 标准输入输出流
 * System类中的两个成员变量
 * 		public static final InputStream in:标准输入流
 * 		public static final PrintStream out:标准输出流
 * 
 * 		InputStream is = System.in
 * 		PrintStream ps = System.out
 */
public class SystemOutDemo {
	public static void main(String[] args) {
		System.out.println("helloworld");

		// 获取标准输出流对象
		PrintStream ps = System.out;// 打印流
		ps.println("helloworld");
	}
}
