package cn.itcast_08;

import java.io.File;

/*
 * �ж�E�����Ƿ��к�׺��Ϊ.jpg���ļ������������ļ���
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
