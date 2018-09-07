package cn.itcast_07;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientDemo {
	public static void main(String[] args) throws IOException {
		Socket s = new Socket("DESKTOP-4O0BFJQ", 12306);

		OutputStream os = s.getOutputStream();
		os.write("hello".getBytes());

		InputStream is = s.getInputStream();
		byte[] bys = new byte[1024];
		int len = is.read(bys);// ×èÈû
		String client = new String(bys, 0, len);
		System.out.println("client=" + client);

		s.close();
	}

}
