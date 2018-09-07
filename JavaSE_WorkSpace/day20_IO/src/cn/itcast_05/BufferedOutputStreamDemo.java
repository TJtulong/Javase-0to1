package cn.itcast_05;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * Java�����ʱר���ṩ�˴����������ֽ���
 * �����౻��Ϊ�������ࣨ��Ч�ࣩ
 * �����ݣ�BufferedIutputStream
 * д���ݣ�BufferedOutputStream
 * 
 * ���췽������ָ���������Ĵ�С��������һ��ʹ��Ĭ�ϻ�������С
 * Ϊʲô������һ�������ļ�������OutputStream����
 * ԭ���ֽڻ����������ṩ��������Ϊ��Ч����ƣ������Ĳ���������Ҫ������������ʵ��
 */
public class BufferedOutputStreamDemo {
	public static void main(String[] args) throws IOException{
		//BufferedOutputStream(OutputStream out)
		/*FileOutputStream fos = new FileOutputStream("bos.txt");
		BufferedOutputStream bos = new BufferedOutputStream(fos);*/
		BufferedOutputStream bos = new BufferedOutputStream(
				new FileOutputStream("bos.txt"));		
		
		bos.write("hello".getBytes());
		
		bos.close();
	}
}
