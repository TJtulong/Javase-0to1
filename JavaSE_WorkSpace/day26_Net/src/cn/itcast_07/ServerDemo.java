package cn.itcast_07;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(12306);
		Socket s = ss.accept();

		// 获取输入流
		InputStream is = s.getInputStream();
		byte[] bys = new byte[1024];
		int len = is.read(bys);// 阻塞
		String server = new String(bys, 0, len);
		System.out.println("server=" + server);

		// 获取输出流
		OutputStream os = s.getOutputStream();
		os.write("数据已收到".getBytes());

		s.close();
		ss.close();
	}
}
