package cn.itcast_02;

import java.io.File;

/*
 * ���������ļ��������е�java�ļ��ľ���·��
 */
public class FilePathDemo {
	public static void main(String[] args) {
		File scrFolder = new File("C:\\Users\\TJtulong\\Desktop");
		
		//�ݹ�ʵ��
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
