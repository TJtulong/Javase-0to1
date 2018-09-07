package cn.itcast_07;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

/*
 * 需求：文本文件中存储了几个名字，随机获取一个名字
 */
public class GetName {
	public static void main(String[] args) throws IOException{
		BufferedReader br =new BufferedReader(new FileReader("b.txt"));
		
		ArrayList<String> array = new ArrayList<String>();
		
		String line = null;
		while((line=br.readLine())!=null) {
			array.add(line);
		}
		
		br.close();
		
		Random r = new Random();
		int index = r.nextInt(array.size());
		
		String name = array.get(index);
		System.out.println(name);
	}
}
