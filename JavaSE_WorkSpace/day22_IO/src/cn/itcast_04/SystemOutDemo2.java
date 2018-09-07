package cn.itcast_04;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;

public class SystemOutDemo2 {
	public static void main(String[] args) throws IOException {
		// 获取标准输出流
		PrintStream ps = System.out;
		OutputStream os = ps;

		OutputStreamWriter osw = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(osw);

		bw.write("hello");
		bw.write("world");
		bw.write("java");
		bw.flush();
		bw.close();
	}
}
