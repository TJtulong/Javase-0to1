package cn.itcast_05;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new FileReader("osw.txt"));
		
		int ch = 0;
		while((ch=br.read())!=-1) {
			System.out.println((char)ch);
		}
		
		br.close();
	}
}
