package cn.itcast_03;

import java.io.File;
import java.io.IOException;

/*
 * 注意：如果创建文件或目录忘记写盘符路径，默认在项目路径上
 * 删除功能：public boolean delete();
 * 注意：java中的删除不走回收站
 * 		要删除一个文件夹时，该文件夹内不能有文件或文件夹
 */
public class FileDemo {
	public static void main(String[] args) throws IOException {
		// 删除功能
		File file = new File("a.txt");
		file.createNewFile();
		System.out.println("delete:" + file.delete());

		File file2 = new File("c:\\Users\\TJtulong\\Desktop\\test\\aaa");
		file2.delete();
	}
}
