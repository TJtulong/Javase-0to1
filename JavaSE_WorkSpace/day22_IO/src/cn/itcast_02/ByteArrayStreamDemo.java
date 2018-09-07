package cn.itcast_02;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/*
 * 内存操作流：用于处理临时存储信息的，程序结束，数据就从内存中消失
 * 字节数组：(无中文)
 * 		ByteArrayInputStream
 * 		ByteArrayOutputStream
 * 字符数组：(有中文)
 * 		CharArrayReader
 * 		CharArrayWriter
 * 字符串：
 * 		StringReader
 * 		StringWriter
 */
public class ByteArrayStreamDemo {
	public static void main(String[] args) throws IOException {
		// 创建输出流对象
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		// 写数据
		for (int x = 0; x < 10; x++) {
			baos.write(("hello" + x).getBytes());
		}
		// 不需要close()

		byte[] bys = baos.toByteArray();
		// 读数据
		ByteArrayInputStream bais = new ByteArrayInputStream(bys);

		int by = 0;
		while ((by = bais.read()) != -1) {
			System.out.println((char) by);
		}
	}
}
