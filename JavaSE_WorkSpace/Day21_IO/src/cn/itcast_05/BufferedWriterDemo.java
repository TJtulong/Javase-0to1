package cn.itcast_05;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 字符流为了高效读写，也提供了对应的字符缓冲流
 * BufferedWriter:字符缓冲输出流
 * BufferedReader:字符缓冲输入流
 */
public class BufferedWriterDemo {
	public static void main(String[] args) throws IOException {
		/*
		 * BufferedWriter bw = new BufferedWriter( new OutputStreamWriter(new
		 * FileOutputStream("osw.txt")));
		 */

		BufferedWriter bw = new BufferedWriter(new FileWriter("osw.txt"));

		bw.write("hello");
		bw.write("world");
		bw.write("java");
		bw.flush();

		bw.close();
	}
}
