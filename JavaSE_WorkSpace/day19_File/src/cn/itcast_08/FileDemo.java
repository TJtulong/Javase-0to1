package cn.itcast_08;

import java.io.File;

/*
 * 判断E盘下是否有后缀名为.jpg的文件，如果有输出文件名
 */
public class FileDemo {
	public static void main(String[] args) {
		File file = new File("c:\\Users\\TJtulong\\Desktop");

		File[] fileArray = file.listFiles();
		for (File f : fileArray) {
			if (f.isFile()) {
				if (f.getName().endsWith(".pdf")) {
					System.out.println(f.getName());
				}
			}
		}
	}
}
