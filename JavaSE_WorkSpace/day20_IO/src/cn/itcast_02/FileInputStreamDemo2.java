package cn.itcast_02;

import java.io.FileInputStream;
import java.io.IOException;

/*
 * һ�ζ�ȡһ���ַ����飺int read(byte[] b)
 * intΪʵ�ʶ�ȡ���ֽڸ���
 * �����ȡ��-1��˵��û��������
 * �ֽ�����Ĭ��ֵΪ0
 */
public class FileInputStreamDemo2 {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("fos3.txt");

		// ����ĳ���һ����1024��1024�ı�����1k���ݣ�
		byte[] bys = new byte[1024];
		int len = 0;
		while ((len = fis.read(bys)) != -1) {
			// System.out.println(len);
			System.out.print(new String(bys, 0, len));
		}

		fis.close();
	}
}
