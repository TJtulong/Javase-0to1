package cn.itcast_03;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/*
 * 可以操作任意类型的数据
 * print()
 * println()
 * 启动自动刷新：必须用println()方法
 * 		不仅仅自动刷新，还能够自动换行
 */
public class PrintWriterDemo2 {
	public static void main(String[] args) throws IOException {
		// PrintWriter pw =new PrintWriter("pw.txt");
		// 启用自动刷新
		PrintWriter pw = new PrintWriter(new FileWriter("pw.txt"), true);

		/*
		 * pw.print(true); pw.print(100); pw.print("hello");
		 */

		pw.println(true);
		pw.println(100);
		pw.println("hello");

		pw.close();
	}
}
