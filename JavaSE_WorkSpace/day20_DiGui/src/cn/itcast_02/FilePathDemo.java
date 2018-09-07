package cn.itcast_02;

import java.io.File;

/*
 * 把桌面上文件夹中所有的java文件的绝对路径
 */
public class FilePathDemo {
	public static void main(String[] args) {
		File scrFolder = new File("C:\\Users\\TJtulong\\Desktop");
		
		//递归实现
		getAllFilePaths(scrFolder);
	}

	private static void getAllFilePaths(File scrFolder) {
		File[] fileArray =scrFolder.listFiles();
		
		for(File file:fileArray) {
			if(file.isDirectory()) {
				getAllFilePaths(file);
			}else {
				if(file.getName().endsWith(".java")) {
					System.out.println(file.getAbsolutePath());
				}
			}
		}
	}
}
