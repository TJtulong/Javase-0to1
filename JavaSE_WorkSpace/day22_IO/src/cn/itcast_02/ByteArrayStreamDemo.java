package cn.itcast_02;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/*
 * �ڴ�����������ڴ�����ʱ�洢��Ϣ�ģ�������������ݾʹ��ڴ�����ʧ
 * �ֽ����飺(������)
 * 		ByteArrayInputStream
 * 		ByteArrayOutputStream
 * �ַ����飺(������)
 * 		CharArrayReader
 * 		CharArrayWriter
 * �ַ�����
 * 		StringReader
 * 		StringWriter
 */
public class ByteArrayStreamDemo {
	public static void main(String[] args) throws IOException {
		// �������������
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		// д����
		for (int x = 0; x < 10; x++) {
			baos.write(("hello" + x).getBytes());
		}
		// ����Ҫclose()

		byte[] bys = baos.toByteArray();
		// ������
		ByteArrayInputStream bais = new ByteArrayInputStream(bys);

		int by = 0;
		while ((by = bais.read()) != -1) {
			System.out.println((char) by);
		}
	}
}
