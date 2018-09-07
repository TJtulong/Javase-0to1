package cn.itcast_05;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

/*
 * �ַ���Ϊ�˸�Ч��д��Ҳ�ṩ�˶�Ӧ���ַ�������
 * BufferedWriter:�ַ����������
 * BufferedReader:�ַ�����������
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
