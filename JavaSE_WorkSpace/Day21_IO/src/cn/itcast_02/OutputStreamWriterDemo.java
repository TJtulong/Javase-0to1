package cn.itcast_02;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/*
 * OutputStreamWriter(OutputStream out):�ַ�����Ĭ�ϱ����
 * OutputStreamWriter(OutputStream out, String charsetName)
 * ���ֽ���ת��Ϊ�ַ���
 */
public class OutputStreamWriterDemo {
	public static void main(String[] args) throws IOException {
		//��������(Ĭ��GBK)
		//OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("osw.txt"));
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("osw.txt"),"UTF-8");
		
		//д����
		osw.write("�й�");
		
		osw.close();
	}
}
