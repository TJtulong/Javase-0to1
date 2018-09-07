package cn.itcast_01;

import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 如何实现数据的换行
 * 		写入换行符号\n
 * 		通过window记事本打开不可以
 * 		不同的系统针对不同的换行符号识别是不同的
 * 		windows：\r\n
 * 		linus:\r
 * 		Mac:\n
 * 		高级记事本软件可以识别任何换行符的
 * 
 * 如何实现数据的追加写入：
 * 构造---->第二个方法参数为true
 */
public class FileOutputStreamDemo3 {
	public static void main(String[] args) throws IOException {
		//FileOutputStream fos = new FileOutputStream("fos3.txt");
		FileOutputStream fos = new FileOutputStream("fos3.txt",true);

		for (int x = 0; x < 10; x++) {
			fos.write(("hello" + x + "\r\n").getBytes());// windows
		}

		fos.close();
	}
}
