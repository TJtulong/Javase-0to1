package cn.itcast_03;

import java.io.IOException;
import java.io.PrintWriter;

/*
 * ��ӡ��
 * �ֽڴ�ӡ��		PrintStream
 * �ַ���ӡ��		PrintWriter
 * 
 * ��ӡ�����ص㣺	ֻ��д���ݣ�û�ж�ȡ����
 * 				���Բ����������͵�����
 * 				����������Զ�ˢ���ܹ��Զ�ˢ��
 * 				�����ǿ���ֱ�Ӳ����ı��ļ���
 * 
 * ����Ϊ���֣�	���������ܹ�ֱ�Ӷ�д�ļ�
 * 				�߼������ڻ��������ṩһЩ��������
 */
public class PrintWriterDemo {
	public static void main(String[] args) throws IOException {
		// ��Ϊwrite������ʹ��
		PrintWriter pw = new PrintWriter("pw.txt");

		pw.write("hello");
		pw.write("world");
		pw.write("java");

		pw.close();
	}
}
