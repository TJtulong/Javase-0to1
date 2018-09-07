package cn.itcast_04;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
 * ��д����
 * ����Դ��osw.txt
 * Ŀ�ĵأ�b.txt
 */
public class CopyFileDemo {
	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(new FileInputStream("osw.txt"));
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("b.txt"));

		char[] chs = new char[1024];
		int len = 0;
		while ((len = isr.read(chs)) != -1) {
			osw.write(chs, 0, len);
			osw.flush();
		}

		isr.close();
		osw.close();
	}
}
