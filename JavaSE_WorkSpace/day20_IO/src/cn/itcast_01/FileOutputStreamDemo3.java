package cn.itcast_01;

import java.io.FileOutputStream;
import java.io.IOException;

/*
 * ���ʵ�����ݵĻ���
 * 		д�뻻�з���\n
 * 		ͨ��window���±��򿪲�����
 * 		��ͬ��ϵͳ��Բ�ͬ�Ļ��з���ʶ���ǲ�ͬ��
 * 		windows��\r\n
 * 		linus:\r
 * 		Mac:\n
 * 		�߼����±��������ʶ���κλ��з���
 * 
 * ���ʵ�����ݵ�׷��д�룺
 * ����---->�ڶ�����������Ϊtrue
 */
public class FileOutputStreamDemo3 {
	public static void main(String[] args) throws IOException {
		//FileOutputStream fos = new FileOutputStream("fos3.txt");
		FileOutputStream fos = new FileOutputStream("fos3.txt",true);

		for (int x = 0; x < 10; x++) {
			fos.write(("hello" + x + "\r\n").getBytes());// windows
		}

		fos.close();
	}
}
