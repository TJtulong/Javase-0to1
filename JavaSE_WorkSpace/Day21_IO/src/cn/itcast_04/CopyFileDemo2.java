package cn.itcast_04;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 由于常见操作都是使用默认编码，不需要指定编码
 * 转换流的名称较长,java提供了简单子类供使用
 * OutputStreamWriter = FileOutputStream + 编码表(GBK)
 * FileWriter = FileOutputStream + 编码表(GBK)
 * FileReader = FileInputStream + 编码表(GBK)
 */
public class CopyFileDemo2 {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("osw.txt");
		FileWriter fw = new FileWriter("b.txt");

		char[] chs = new char[1024];
		int len = 0;
		while ((len = fr.read(chs)) != -1) {
			fw.write(chs, 0, len);
			fw.flush();
		}

		fw.close();
	}
}
