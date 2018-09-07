package cn.itcast_03;

import java.io.IOException;
import java.io.PrintWriter;

/*
 * 打印流
 * 字节打印流		PrintStream
 * 字符打印流		PrintWriter
 * 
 * 打印流的特点：	只有写数据，没有读取数据
 * 				可以操作任意类型的数据
 * 				如果启动了自动刷新能够自动刷新
 * 				该流是可以直接操作文本文件的
 * 
 * 流分为两种：	基本流：能够直接读写文件
 * 				高级流：在基本流上提供一些其它功能
 */
public class PrintWriterDemo {
	public static void main(String[] args) throws IOException {
		// 作为write的子类使用
		PrintWriter pw = new PrintWriter("pw.txt");

		pw.write("hello");
		pw.write("world");
		pw.write("java");

		pw.close();
	}
}
