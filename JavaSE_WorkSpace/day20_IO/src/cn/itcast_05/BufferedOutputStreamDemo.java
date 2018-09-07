package cn.itcast_05;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * Java在设计时专门提供了带缓冲区的字节类
 * 这种类被称为缓冲区类（高效类）
 * 读数据：BufferedIutputStream
 * 写数据：BufferedOutputStream
 * 
 * 构造方法可以指定缓冲区的大小，但我们一般使用默认缓冲区大小
 * 为什么不传递一个具体文件，而是OutputStream对象
 * 原因：字节缓冲区仅仅提供缓冲区，为高效而设计，真正的操作还是需要基本的流对象实现
 */
public class BufferedOutputStreamDemo {
	public static void main(String[] args) throws IOException{
		//BufferedOutputStream(OutputStream out)
		/*FileOutputStream fos = new FileOutputStream("bos.txt");
		BufferedOutputStream bos = new BufferedOutputStream(fos);*/
		BufferedOutputStream bos = new BufferedOutputStream(
				new FileOutputStream("bos.txt"));		
		
		bos.write("hello".getBytes());
		
		bos.close();
	}
}
