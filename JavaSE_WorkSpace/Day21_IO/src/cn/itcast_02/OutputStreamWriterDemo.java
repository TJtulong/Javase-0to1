package cn.itcast_02;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/*
 * OutputStreamWriter(OutputStream out):字符流，默认编码表
 * OutputStreamWriter(OutputStream out, String charsetName)
 * 把字节流转换为字符流
 */
public class OutputStreamWriterDemo {
	public static void main(String[] args) throws IOException {
		//创建对象(默认GBK)
		//OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("osw.txt"));
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("osw.txt"),"UTF-8");
		
		//写数据
		osw.write("中国");
		
		osw.close();
	}
}
