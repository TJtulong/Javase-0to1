package cn.itcast_02;

import java.io.FileInputStream;
import java.io.IOException;

/*
 * 字节输入流操作步骤：
 * 1.创建字节输入流对象
 * 2.调用read()方法获取数据
 * 3.close()
 * 
 * 读取数据的方式：
 * 1.int read():一次读取一个字节
 * 		如果返回值为-1，则到达文件末尾
 * 2.int read(byte[] b):一次读取一个字节数组
 */
public class FileInputStreamDemo {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("fos.txt");

		/*int by = fis.read();
		System.out.print((char) by);// H

		by = fis.read();
		System.out.print((char) by);// e

		// 用循环改进
		int by1 = fis.read();
		while (by1 != -1) {
			System.out.print((char) by1);
			by1 = fis.read();
		}*/
		
		//标准代码(无法读中文)
		int by = 0;
		while((by=fis.read())!=-1) {
			System.out.print((char) by);
		}

		fis.close();
	}
}
