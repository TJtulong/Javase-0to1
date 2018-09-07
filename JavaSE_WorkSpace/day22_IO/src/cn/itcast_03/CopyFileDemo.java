package cn.itcast_03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/*
 * 需求：复制文本文件
 */
public class CopyFileDemo {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("pw.txt"));

		PrintWriter pw = new PrintWriter(new FileWriter("dos.txt"), true);

		String line = null;
		while ((line = br.readLine()) != null) {
			pw.println(line);// 一句顶三句
		}

		br.close();
		pw.close();
	}
}
