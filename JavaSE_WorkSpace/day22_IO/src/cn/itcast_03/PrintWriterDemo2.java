package cn.itcast_03;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/*
 * ���Բ����������͵�����
 * print()
 * println()
 * �����Զ�ˢ�£�������println()����
 * 		�������Զ�ˢ�£����ܹ��Զ�����
 */
public class PrintWriterDemo2 {
	public static void main(String[] args) throws IOException {
		// PrintWriter pw =new PrintWriter("pw.txt");
		// �����Զ�ˢ��
		PrintWriter pw = new PrintWriter(new FileWriter("pw.txt"), true);

		/*
		 * pw.print(true); pw.print(100); pw.print("hello");
		 */

		pw.println(true);
		pw.println(100);
		pw.println("hello");

		pw.close();
	}
}
