package cn.itcast_04;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * ���ڳ�����������ʹ��Ĭ�ϱ��룬����Ҫָ������
 * ת���������ƽϳ�,java�ṩ�˼����๩ʹ��
 * OutputStreamWriter = FileOutputStream + �����(GBK)
 * FileWriter = FileOutputStream + �����(GBK)
 * FileReader = FileInputStream + �����(GBK)
 */
public class CopyFileDemo2 {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("osw.txt");
		FileWriter fw = new FileWriter("b.txt");

		char[] chs = new char[1024];
		int len = 0;
		while ((len = fr.read(chs)) != -1) {
			fw.write(chs, 0, len);
			fw.flush();
		}

		fw.close();
	}
}
