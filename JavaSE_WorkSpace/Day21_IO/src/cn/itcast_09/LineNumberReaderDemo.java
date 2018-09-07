package cn.itcast_09;

import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

//BufferedReader---->LineNumberReader
public class LineNumberReaderDemo {
	public static void main(String[] args) throws IOException {
		LineNumberReader lnr = new LineNumberReader(new FileReader("b.txt"));

		lnr.setLineNumber(10);// ��10��ʼ���

		String line = null;
		while ((line = lnr.readLine()) != null) {
			System.out.println(lnr.getLineNumber() + ":" + line);// ����к�
		}

		lnr.close();
	}
}
