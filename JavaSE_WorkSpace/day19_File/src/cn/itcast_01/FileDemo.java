package cn.itcast_01;

import java.io.File;

/*
 * File:是文件和路径名的抽象表达形式
 * 构造方法：(效果相同)
 * 		File(String pathname):路径构造（常用）
 * 		File(String pathname,String child)根据一个目录和一个子文件得到File对象
 * 		File(File parent,String child)根据一个父file对象和子文件得到File对象
 */
public class FileDemo {
	public static void main(String[] args) {
		// File(String pathname)
		File file = new File("C:\\Users\\TJtulong\\Desktop\\a.txt");
		// 并不是创建，只是抽象的形式

		// File(String pathname,String child)
		File file2 = new File("C:\\Users\\TJtulong\\Desktop", "a.txt");

		// File(File parent,String child)
		File file3 = new File("C:\\Users\\TJtulong\\Desktop");
		File file4 = new File(file3, "a.txt");
	}
}
