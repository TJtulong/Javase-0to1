package cn.itcast_03;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * ����ͼƬ
 */
public class CopyImageDemo {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream
				("C:\\Users\\TJtulong\\Desktop\\������Ϣ.png");
		FileOutputStream fos = new FileOutputStream("mn.png");
		
		int by =0;
		while((by=fis.read())!=-1) {
			fos.write(by);
		}
		
		fos.close();
		fis.close();
	}
}
