package cn.itcast_09;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

/*
 * NIO����JDK4���֣������IO���Ĳ���Ч��
 * 
 * JDK7���NIO
 * Path��·��
 * Paths����һ����̬��������·��
 * 		public static Psth get(URI uri)
 * Files���ṩ�˾�̬����������ʹ��
 */
public class NIODemo {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		//�����ļ�
		Files.copy(Paths.get("dos.txt"), new FileOutputStream("copy.txt"));
		
		ArrayList<String> array = new ArrayList<>();
		array.add("hello");
		array.add("world");
		array.add("java");
		
		Files.write(Paths.get("array.txt"), array,Charset.forName("GBK"));
	}
}
