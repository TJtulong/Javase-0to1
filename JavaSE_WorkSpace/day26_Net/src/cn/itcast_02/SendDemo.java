package cn.itcast_02;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/*
 * UDPЭ�鷢������:
 * 1.�������Ͷ˵�Socket����
 * 2.�������ݲ������ݴ��
 * 3.����Socket����ķ��ͷ����������ݰ�
 * 4.�ͷ���Դ
 */
public class SendDemo {
	public static void main(String[] args) throws IOException {
		DatagramSocket ds = new DatagramSocket();

		// ��������
		byte[] bys = "hello,udp".getBytes();
		// ����
		int length = bys.length;
		// IP��ַ����
		InetAddress address = InetAddress.getByName("DESKTOP-4O0BFJQ");
		// �˿�
		int port = 10086;
		// ��������
		DatagramPacket dp = new DatagramPacket(bys, length, address, port);

		ds.send(dp);

		ds.close();
	}
}
