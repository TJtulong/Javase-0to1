package cn.itcast_06;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

/*
 * TCPЭ�鷢�����ݣ�
 * 1.�������Ͷ˵�Socket������һ������ɹ���˵���ѽ�������
 * 2.��ȡ�������д����
 * 3.�ͷ���Դ
 * TCPЭ��һ��Ҫ�ȿ�������
 */
public class ClientDemo {
	public static void main(String[] args) throws IOException {
		// �������Ͷ˵�Socket����
		// Socket s = new Socket(InetAddress.getByName("DESKTOP-4O0BFJQ"), 8888);
		Socket s = new Socket("DESKTOP-4O0BFJQ", 12306);

		// ��ȡ�����
		OutputStream os = s.getOutputStream();
		os.write("hello".getBytes());

		// �ͷ���Դ
		s.close();
	}
}
