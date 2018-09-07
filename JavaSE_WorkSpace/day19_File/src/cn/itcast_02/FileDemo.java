package cn.itcast_02;

import java.io.File;
import java.io.IOException;

/*
 * 创建功能：
 * 		public boolean createNewFile():创建文件
 * 		public boolean mkdir():创建文件夹,如果存在就不创建了，返回false
 * 		public boolean mkdirs():创建文件夹,如果父文件夹不存在，会自动创建
 */
public class FileDemo {
	public static void main(String[] args) throws IOException {
		// 在桌面创建文件夹demo
		File file = new File("c:\\Users\\TJtulong\\Desktop\\demo");
		System.out.println("mkdir:" + file.mkdir());

		// 在demo文件夹下创建a.txt
		File file2 = new File("c:\\Users\\TJtulong\\Desktop\\demo\\a.txt");
		System.out.println("createnewfile:" + file2.createNewFile());

		// 在桌面text目录下创建b.txt
		// Exception in thread "main" java.io.IOException
		// 先建目录，在创造文件
		// File file3=new File("c:\\Users\\TJtulong\\Desktop\\test\\b.txt");
		// System.out.println("createnewfile:"+file3.createNewFile());

		// 在桌面test目录下创建aaa目录
		File file4 = new File("c:\\Users\\TJtulong\\Desktop\\test\\aaa");
		System.out.println("mkdir:" + file4.mkdir());// mkdir:false

		/*
		 * File file5=new File("c:\\Users\\TJtulong\\Desktop\\test"); File file6=new
		 * File("c:\\Users\\TJtulong\\Desktop\\test\\aaa");
		 * System.out.println("mkdir:"+file5.mkdir());
		 * System.out.println("mkdir:"+file6.mkdir());
		 */

		File file7 = new File("c:\\Users\\TJtulong\\Desktop\\test\\aaa");
		System.out.println("mkdir:" + file7.mkdirs());

		File file8 = new File("c:\\Users\\TJtulong\\Desktop\\test\\a.txt");
		System.out.println("mkdir:" + file8.mkdirs());
		// 创建了a.txt文件夹
	}
}
