package cn.itcast_02;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * InputStreamReader(InputStream is):Ĭ�ϱ���
 * InputStreamReader(InputStream is,String charset)��ָ������
 */
public class InputStreamReaderDemo {
	public static void main(String[] args) throws IOException {
		//InputStreamReader isr = new InputStreamReader(new FileInputStream("osw.txt"));
		InputStreamReader isr = new InputStreamReader(new FileInputStream("osw.txt"),"UTF-8");
		
		int ch = 0;
		while((ch=isr.read())!=-1) {
			System.out.print((char)ch);//�й�
		}
		
		isr.close();
	}
}
