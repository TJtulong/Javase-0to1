package cn.itcast_07;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/*
 * ���󣺰�ArrayList�����е��ַ������ݴ洢���ı���
 * �ı��ļ�ʹ���ַ���
 */
public class ArrayListTofileDemo {
	public static void main(String[] args) throws IOException{
		ArrayList<String> array = new ArrayList<String>();
		array.add("hello");
		array.add("world");
		array.add("java");
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("b.txt"));
		
		for(String s:array) {
			bw.write(s);
			bw.newLine();
			bw.flush();
		}
		
		bw.close();
	}
}
