package cn.itcast_08;

import java.io.File;
import java.io.FilenameFilter;

/*
 * 判断E盘下是否有后缀名为.jpg的文件，如果有输出文件名
 * 文件名过滤器
 * public String[] list(FileNameFilter filter)
 * public File[] listFiles(FileNameFilter filter)
 */
public class FileDemo2 {
	public static void main(String[] args) {
		File file = new File("c:\\Users\\TJtulong\\Desktop");

		String[] strArray = file.list(new FilenameFilter() {

			@Override
			public boolean accept(File dir, String name) {
				// return false;
				File file = new File(dir, name);
				boolean flag = file.isFile();
				boolean flag2 = name.endsWith(".pdf");
				return flag && flag2;
			}
		});

		for (String s : strArray) {
			System.out.println(s);
		}
	}
}
