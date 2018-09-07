package cn.itcast_02;

import java.io.FileInputStream;
import java.io.IOException;

/*
 * 一次读取一个字符数组：int read(byte[] b)
 * int为实际读取的字节个数
 * 如果读取到-1，说明没有数据了
 * 字节数组默认值为0
 */
public class FileInputStreamDemo2 {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("fos3.txt");

		// 数组的长度一般是1024或1024的倍数（1k数据）
		byte[] bys = new byte[1024];
		int len = 0;
		while ((len = fis.read(bys)) != -1) {
			// System.out.println(len);
			System.out.print(new String(bys, 0, len));
		}

		fis.close();
	}
}
