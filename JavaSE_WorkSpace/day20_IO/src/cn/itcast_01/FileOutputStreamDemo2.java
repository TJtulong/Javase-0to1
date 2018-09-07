package cn.itcast_01;

import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 字节流操作步骤：
 * 1.创建字节输出流对象
 * 2.调用write()方法
 * 3.释放资源
 * 
 * public void write(int b):写一个字节
 * public void write(byte[] b):写一个字节数组
 * public void write(byte[] b, int off,int len)
 */
public class FileOutputStreamDemo2 {
	public static void main(String[] args) throws IOException {
		// 创建字节输出对象
		FileOutputStream fos = new FileOutputStream("fos2.txt");

		// 调用write()方法
		fos.write(97);// a -----底层是二进制数据---通过记事本打开---找97对应的字符值
		fos.write(57);// 9
		fos.write(55);// 7

		byte[] bys = { 97, 98, 99, 100, 101 };// abcde
		fos.write(bys);

		fos.write(bys, 0, 3);// abc

	}
}
