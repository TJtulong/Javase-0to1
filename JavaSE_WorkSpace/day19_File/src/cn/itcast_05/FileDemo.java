package cn.itcast_05;

import java.io.File;

/*
 * 判断功能：
 * 		public boolean isDictionary():判断是否是目录
 * 		public boolean isFile():判断是否是文件
 * 		public boolean exists():判断是否是存在
 * 		public boolean canRead():判断是否可读
 * 		public boolean canWrite():判断是否可写
 * 		public boolean isHidden();判断是否隐藏
 */
public class FileDemo {
	public static void main(String[] args) {
		File file = new File("a.txt");
		System.out.println(file.isDirectory());// false
		System.out.println(file.isFile());// true
		System.out.println(file.exists());// true
		System.out.println(file.canRead());// true
		System.out.println(file.canWrite());// true只读
		System.out.println(file.isHidden());// false隐藏
	}
}
