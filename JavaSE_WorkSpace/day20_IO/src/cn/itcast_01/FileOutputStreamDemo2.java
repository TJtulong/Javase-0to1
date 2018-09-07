package cn.itcast_01;

import java.io.FileOutputStream;
import java.io.IOException;

/*
 * �ֽ����������裺
 * 1.�����ֽ����������
 * 2.����write()����
 * 3.�ͷ���Դ
 * 
 * public void write(int b):дһ���ֽ�
 * public void write(byte[] b):дһ���ֽ�����
 * public void write(byte[] b, int off,int len)
 */
public class FileOutputStreamDemo2 {
	public static void main(String[] args) throws IOException {
		// �����ֽ��������
		FileOutputStream fos = new FileOutputStream("fos2.txt");

		// ����write()����
		fos.write(97);// a -----�ײ��Ƕ���������---ͨ�����±���---��97��Ӧ���ַ�ֵ
		fos.write(57);// 9
		fos.write(55);// 7

		byte[] bys = { 97, 98, 99, 100, 101 };// abcde
		fos.write(bys);

		fos.write(bys, 0, 3);// abc

	}
}
