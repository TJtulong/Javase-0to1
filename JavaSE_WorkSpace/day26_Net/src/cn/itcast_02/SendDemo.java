package cn.itcast_02;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/*
 * UDP协议发送数据:
 * 1.创建发送端的Socket对象
 * 2.创建数据并把数据打包
 * 3.调用Socket对象的发送方法发送数据包
 * 4.释放资源
 */
public class SendDemo {
	public static void main(String[] args) throws IOException {
		DatagramSocket ds = new DatagramSocket();

		// 创建数据
		byte[] bys = "hello,udp".getBytes();
		// 长度
		int length = bys.length;
		// IP地址对象
		InetAddress address = InetAddress.getByName("DESKTOP-4O0BFJQ");
		// 端口
		int port = 10086;
		// 创建数据
		DatagramPacket dp = new DatagramPacket(bys, length, address, port);

		ds.send(dp);

		ds.close();
	}
}
