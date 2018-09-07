package cn.itcast_07;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * ���Ƶ����ļ���
 */
public class CopyFolderDemo {
	public static void main(String[] args) throws IOException {
		// ��װĿ¼
		File srcFolder = new File("e:\\demo");
		// ��װ�ļ���
		File destFolder = new File("e:\\test");
		if (!destFolder.exists()) {
			destFolder.mkdirs();
		}

		File[] fileArray = srcFolder.listFiles();
		for (File file : fileArray) {
			String name = file.getName();
			File newFile = new File(destFolder, name);

			copyFile(file, newFile);
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
