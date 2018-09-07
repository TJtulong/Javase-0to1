package cn.itcast_07;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/*
 * 需求：从文本文件中读取数据存入到集合中
 */
public class FileToArrayListDemo {
	public static void main(String[] args) throws IOException{
		BufferedReader br =new BufferedReader(new FileReader("b.txt"));
		ArrayList<String> array = new ArrayList<>();
		
		String line = null;
		while((line=br.readLine())!=null) {
			array.add(line);
		}
		
		br.close();
		
		for(String s :array) {
			System.out.println(s);
		}
	}
}
