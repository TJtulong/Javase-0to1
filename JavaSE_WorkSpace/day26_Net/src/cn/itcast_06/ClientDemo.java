package cn.itcast_06;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

/*
 * TCP协议发送数据：
 * 1.创建发送端的Socket对象：这一步如果成功，说明已建立连接
 * 2.获取输出流，写数据
 * 3.释放资源
 * TCP协议一定要先开服务器
 */
public class ClientDemo {
	public static void main(String[] args) throws IOException {
		// 创建发送端的Socket对象
		// Socket s = new Socket(InetAddress.getByName("DESKTOP-4O0BFJQ"), 8888);
		Socket s = new Socket("DESKTOP-4O0BFJQ", 12306);

		// 获取输出流
		OutputStream os = s.getOutputStream();
		os.write("hello".getBytes());

		// 释放资源
		s.close();
	}
}
