package cn.itcast_04;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * ∏¥÷∆Õº∆¨
 */
public class CopyFileDemo {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\TJtulong\\Desktop\\Õ¯¬Á–≈œ¢.png");

		FileOutputStream fos = new FileOutputStream("dd.png");

		byte[] bys = new byte[1024];
		int len = 0;
		while ((len = fis.read(bys)) != -1) {
			fos.write(bys, 0, len);
		}

		fis.close();
		fos.close();
	}
}
