package cn.itcast_06;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 采用字符缓冲流复制文档
 */
public class CopyFileDemo {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new FileReader("osw.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("b.txt"));
		
		char[] chs = new char[1024];
		int len = 0;
		while((len = br.read(chs))!=-1) {
			bw.write(chs,0,len);
			bw.flush();
		}
		
		bw.close();
		br.close();
	}
}
