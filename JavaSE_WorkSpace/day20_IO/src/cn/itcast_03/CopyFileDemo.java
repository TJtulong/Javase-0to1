package cn.itcast_03;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * �����ı��ļ�
 * 
 * ����Դ����������
 * a.txt
 * Ŀ�ĵأ���������
 * b.txt
 * 
 * ��������û������
 * �ڿ���̨���һ���ֽ�ת��Ϊ�ַ��Ľ��
 * ͨ��IO����ȡ���ݣ�д���ı��ļ���û�����κ�ת��
 * �ڼ���������ĵĴ洢�������ֽ�
 * 			��һ���ֽڱ�Ϊ����
 * 			�ڶ����ֽڳ���Ϊ����������Ϊ������û��Ӱ��
 */
public class CopyFileDemo {
	public static void main(String[] args) throws IOException {
		FileInputStream fis= new FileInputStream("fos3.txt");
		FileOutputStream fos = new FileOutputStream("b.txt");
		
		int by = 0;
		while((by=fis.read())!=-1) {
			fos.write(by);
		}
		
		fis.close();
		fos.close();
	}
}
