package cn.itcast_02;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/*
 * UDP协议接收数据:
 * 1.创建发送端的Socket对象
 * 2.创建数据包(接收容器)
 * 3.调用Socket对象的接收方法接收数据包
 * 4.解析数据包，并显示在数据台
 * 5.释放资源
 */
public class ReceiveDemo {
	public static void main(String[] args) throws IOException {
		DatagramSocket ds = new DatagramSocket(10086);

		byte[] bys = new byte[1024];
		int length = bys.length;
		DatagramPacket dp = new DatagramPacket(bys, length);
		ds.receive(dp);// 阻塞

		// 获取对方的IP
		InetAddress address = dp.getAddress();
		String ip = address.getHostAddress();

		byte[] bys2 = dp.getData();
		int len = dp.getLength();
		String s = new String(bys2, 0, len);
		System.out.println(ip + "传递的数据是:" + s);

		ds.close();
	}
}
