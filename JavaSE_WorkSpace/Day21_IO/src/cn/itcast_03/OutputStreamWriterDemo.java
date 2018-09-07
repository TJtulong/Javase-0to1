package cn.itcast_03;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/*
 *  OutputStreamWriter的方法：
 *  public void write(int c):写一个字符
 *  public void write(char[] cbuf):写一个字符数组
 *  public void write(char[],int off,int len):写一个字符数组的一部分
 *  public void write(String str):写一个字符串
 *  public void write(String str,int off,int len)：写一个字符串的一部分
 *  
 *  面试题：close()与flush()的区别
 *  		1.close()关闭流对象，先刷新缓冲区，关闭之后对象不能使用
 *  		2.flush()仅仅刷新缓冲区，流对象依然存在
 */
public class OutputStreamWriterDemo {
	public static void main(String[] args) throws IOException {
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("osw.txt"));

		osw.write('林');

		char[] chs = { '王', '若', '潇' };
		osw.write(chs);

		osw.write(chs, 1, 2);

		osw.write("王若潇");

		osw.write("王若潇", 1, 2);

		osw.flush();// 刷新缓冲区
		osw.close();
	}
}
