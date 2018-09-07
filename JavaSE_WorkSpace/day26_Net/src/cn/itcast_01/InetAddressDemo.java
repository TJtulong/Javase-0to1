package cn.itcast_01;

import java.net.InetAddress;
import java.net.UnknownHostException;

/*
 * 如果一个类没有构造方法：
 * 1.成员全部是静态(Math,Arrays,Collections)
 * 2.单例设计模式(Runtime)
 * 3.类中有静态方法返回该类对象
 * 
 * 成员方法：public static InetAddress getByNames(String host)
 * 			根据主机名或者IP地址的字符串表示得到IP地址对象
 */
public class InetAddressDemo {
	public static void main(String[] args) throws UnknownHostException {
		//InetAddress address = InetAddress.getByName("DESKTOP-4O0BFJQ");
		InetAddress address = InetAddress.getByName("192.168.31.118");
		
		//获取主机名和IP地址
		String name = address.getHostName();
		String ip = address.getHostAddress();
		System.out.println(name+"---"+ip);
	}
}
