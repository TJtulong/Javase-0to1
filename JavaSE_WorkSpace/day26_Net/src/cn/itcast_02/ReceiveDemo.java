package cn.itcast_02;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/*
 * UDPЭ���������:
 * 1.�������Ͷ˵�Socket����
 * 2.�������ݰ�(��������)
 * 3.����Socket����Ľ��շ����������ݰ�
 * 4.�������ݰ�������ʾ������̨
 * 5.�ͷ���Դ
 */
public class ReceiveDemo {
	public static void main(String[] args) throws IOException {
		DatagramSocket ds = new DatagramSocket(10086);

		byte[] bys = new byte[1024];
		int length = bys.length;
		DatagramPacket dp = new DatagramPacket(bys, length);
		ds.receive(dp);// ����

		// ��ȡ�Է���IP
		InetAddress address = dp.getAddress();
		String ip = address.getHostAddress();

		byte[] bys2 = dp.getData();
		int len = dp.getLength();
		String s = new String(bys2, 0, len);
		System.out.println(ip + "���ݵ�������:" + s);

		ds.close();
	}
}
