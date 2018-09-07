package cn.itcast_05;

import java.io.IOException;
import java.io.RandomAccessFile;

/*
 * 随机访问流：
 * 支持对文件的随机访问及写入
 * 
 * public RandomAccessFile(String name,String mode)
 * 第一个参数是文件路径，第二个参数是操作文件的模式
 * 模式有四种，最常用的为"rw"，既可以写也可以读数据
 */
public class RandomAccessFileDemo {
	public static void main(String[] args) throws IOException {
		// write();
		read();
	}

	private static void read() throws IOException {
		RandomAccessFile raf = new RandomAccessFile("raf.txt", "rw");

		int i = raf.readInt();
		System.out.println(i);
		System.out.println("当前文件的指针位置是" + raf.getFilePointer());// 4

		char ch = raf.readChar();
		System.out.println(ch);
		System.out.println("当前文件的指针位置是" + raf.getFilePointer());// 6

		String s = raf.readUTF();
		System.out.println(s);
		System.out.println("当前文件的指针位置是" + raf.getFilePointer());// 14=6+3*2+2

		// 直接读取a
		raf.seek(4);
		char ch1 = raf.readChar();
		System.out.println(ch); // a
	}

	private static void write() throws IOException {
		RandomAccessFile raf = new RandomAccessFile("raf.txt", "rw");

		raf.writeInt(100);
		raf.writeChar('a');
		raf.writeUTF("中国");

		raf.close();
	}
}
