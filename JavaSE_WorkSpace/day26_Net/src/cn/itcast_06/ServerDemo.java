package cn.itcast_06;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * TCP协议接收数据：
 * 1.创建接收端的Socket对象
 * 2.监听客户端，返回一个对象的Socket对象(三次握手)
 * 3.获取输入流，读取数据
 * 4.释放资源
 * TCP协议一定要先开服务器
 */
public class ServerDemo {
	public static void main(String[] args) throws IOException {
		// 创建接收端的Socket对象
		ServerSocket ss = new ServerSocket(12306);

		// 监听客户端，返回一个对象的Socket对象
		Socket s = ss.accept();

		// 获取输入流，读取数据
		InputStream is = s.getInputStream();
		byte[] bys = new byte[1024];
		int len = is.read(bys);
		String str = new String(bys, 0, len);

		String ip = s.getInetAddress().getHostAddress();

		System.out.println(ip + "---" + str);

		// 释放资源
		s.close();
	}
}
