package cn.itcast_04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/*
 * System.in 标准输入流，从键盘获取数据
 * 键盘录入数据
 * 		1.main方法中的args接收参数
 * 		2.Scanner()  JDK1.5以后
 * 		3.通过字符缓冲流包装标准输入流
 * 		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 */
public class SystemInDemo {
	public static void main(String[] args) throws IOException{
		//获取标准输入流
		InputStream is = System.in;
		
		//一次获取一行数据readline()
		//把字节流转换为字符流
		/*InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);*/
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("请输入一个字符串");
		String line = br.readLine();
		System.out.println(line);
	}
}
