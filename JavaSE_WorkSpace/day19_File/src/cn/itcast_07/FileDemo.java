package cn.itcast_07;

import java.io.File;

/*
 * 获取功能：
 * 		public String[] list():获取指定目录下的所有文件或者文件夹的名称数组
 * 		public File[] listFiles():获取指定目录下的所有文件或者文件夹的File数组
 */
public class FileDemo {
	public static void main(String[] args) {
		File file = new File("c:\\Users\\TJtulong\\Desktop");
		
		String[] strArray=file.list();
		for(String s:strArray) {
			System.out.println(s);
		}
		System.out.println("------------");
		
		File[] fileArray = file.listFiles();
		for(File f:fileArray) {
			System.out.println(f.getName());
		}
	}
}
