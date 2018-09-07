package cn.itcast_03;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 复制文本文件
 * 
 * 数据源：从哪里来
 * a.txt
 * 目的地：到哪里来
 * b.txt
 * 
 * 复制中文没有问题
 * 在控制台输出一个字节转换为字符的结果
 * 通过IO流读取数据，写到文本文件，没有做任何转换
 * 在计算机中中文的存储分两个字节
 * 			第一个字节必为负数
 * 			第二个字节常见为负数，部分为正数，没有影响
 */
public class CopyFileDemo {
	public static void main(String[] args) throws IOException {
		FileInputStream fis= new FileInputStream("fos3.txt");
		FileOutputStream fos = new FileOutputStream("b.txt");
		
		int by = 0;
		while((by=fis.read())!=-1) {
			fos.write(by);
		}
		
		fis.close();
		fos.close();
	}
}
