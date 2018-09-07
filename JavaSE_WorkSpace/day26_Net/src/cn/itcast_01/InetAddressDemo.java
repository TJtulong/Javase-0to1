package cn.itcast_01;

import java.net.InetAddress;
import java.net.UnknownHostException;

/*
 * ���һ����û�й��췽����
 * 1.��Աȫ���Ǿ�̬(Math,Arrays,Collections)
 * 2.�������ģʽ(Runtime)
 * 3.�����о�̬�������ظ������
 * 
 * ��Ա������public static InetAddress getByNames(String host)
 * 			��������������IP��ַ���ַ�����ʾ�õ�IP��ַ����
 */
public class InetAddressDemo {
	public static void main(String[] args) throws UnknownHostException {
		//InetAddress address = InetAddress.getByName("DESKTOP-4O0BFJQ");
		InetAddress address = InetAddress.getByName("192.168.31.118");
		
		//��ȡ��������IP��ַ
		String name = address.getHostName();
		String ip = address.getHostAddress();
		System.out.println(name+"---"+ip);
	}
}
