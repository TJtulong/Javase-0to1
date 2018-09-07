package cn.itcast_06;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * TCPЭ��������ݣ�
 * 1.�������ն˵�Socket����
 * 2.�����ͻ��ˣ�����һ�������Socket����(��������)
 * 3.��ȡ����������ȡ����
 * 4.�ͷ���Դ
 * TCPЭ��һ��Ҫ�ȿ�������
 */
public class ServerDemo {
	public static void main(String[] args) throws IOException {
		// �������ն˵�Socket����
		ServerSocket ss = new ServerSocket(12306);

		// �����ͻ��ˣ�����һ�������Socket����
		Socket s = ss.accept();

		// ��ȡ����������ȡ����
		InputStream is = s.getInputStream();
		byte[] bys = new byte[1024];
		int len = is.read(bys);
		String str = new String(bys, 0, len);

		String ip = s.getInetAddress().getHostAddress();

		System.out.println(ip + "---" + str);

		// �ͷ���Դ
		s.close();
	}
}
