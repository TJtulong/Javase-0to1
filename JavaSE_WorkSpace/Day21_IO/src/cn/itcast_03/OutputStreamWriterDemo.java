package cn.itcast_03;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/*
 *  OutputStreamWriter�ķ�����
 *  public void write(int c):дһ���ַ�
 *  public void write(char[] cbuf):дһ���ַ�����
 *  public void write(char[],int off,int len):дһ���ַ������һ����
 *  public void write(String str):дһ���ַ���
 *  public void write(String str,int off,int len)��дһ���ַ�����һ����
 *  
 *  �����⣺close()��flush()������
 *  		1.close()�ر���������ˢ�»��������ر�֮�������ʹ��
 *  		2.flush()����ˢ�»���������������Ȼ����
 */
public class OutputStreamWriterDemo {
	public static void main(String[] args) throws IOException {
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("osw.txt"));

		osw.write('��');

		char[] chs = { '��', '��', '��' };
		osw.write(chs);

		osw.write(chs, 1, 2);

		osw.write("������");

		osw.write("������", 1, 2);

		osw.flush();// ˢ�»�����
		osw.close();
	}
}
