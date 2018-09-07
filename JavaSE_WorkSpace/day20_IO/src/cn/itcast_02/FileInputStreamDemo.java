package cn.itcast_02;

import java.io.FileInputStream;
import java.io.IOException;

/*
 * �ֽ��������������裺
 * 1.�����ֽ�����������
 * 2.����read()������ȡ����
 * 3.close()
 * 
 * ��ȡ���ݵķ�ʽ��
 * 1.int read():һ�ζ�ȡһ���ֽ�
 * 		�������ֵΪ-1���򵽴��ļ�ĩβ
 * 2.int read(byte[] b):һ�ζ�ȡһ���ֽ�����
 */
public class FileInputStreamDemo {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("fos.txt");

		/*int by = fis.read();
		System.out.print((char) by);// H

		by = fis.read();
		System.out.print((char) by);// e

		// ��ѭ���Ľ�
		int by1 = fis.read();
		while (by1 != -1) {
			System.out.print((char) by1);
			by1 = fis.read();
		}*/
		
		//��׼����(�޷�������)
		int by = 0;
		while((by=fis.read())!=-1) {
			System.out.print((char) by);
		}

		fis.close();
	}
}
