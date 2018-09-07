package cn.itcast_05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 字符缓冲流的特殊方法
 * BufferWriter:
 * 		public void newLine() 换行符，根据系统决定
 * BufferReader:
 * 		public String readLine() 一次读一行数据
 * 		不包含换行符，自己加换行
 */
public class BufferedDemo {
	public static void main(String[] args) throws IOException {
		write();
		read();
	}

	private static void read() throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("osw.txt"));

		String line = null;
		while ((line = br.readLine()) != null) {
			System.out.println(line);
		}

		br.close();
	}

	public static void write() throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter("osw.txt"));

		for (int x = 0; x < 10; x++) {
			bw.write("hello" + x);
			bw.newLine();
			bw.flush();
		}

		bw.close();
	}
}
