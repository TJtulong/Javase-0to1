package cn.itcast_07;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 复制多级文件夹
 */
public class CopyFoldersDemo {
	public static void main(String[] args) throws IOException {
		File srcFile = new File("e:\\demos");
		File destFile = new File("c:\\demos");

		copyForders(srcFile, destFile);
	}

	private static void copyForders(File srcFile, File destFile) throws IOException {
		if (srcFile.isDirectory()) {
			// 文件夹
			File newFolder = new File(destFile, srcFile.getName());
			newFolder.mkdir();

			File[] fileArray = srcFile.listFiles();
			for (File file : fileArray) {
				copyFile(file, newFolder);
			}

		} else {
			// 文件
			File newFile = new File(destFile, srcFile.getName());
			copyFile(srcFile, newFile);
		}
	}

	private static void copyFile(File file, File newFile) throws IOException {
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));

		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(newFile));

		byte[] bys = new byte[1024];
		int len = 0;
		while ((len = bis.read(bys)) != -1) {
			bos.write(bys, 0, len);
		}

		bos.close();
		bis.close();
	}
}
