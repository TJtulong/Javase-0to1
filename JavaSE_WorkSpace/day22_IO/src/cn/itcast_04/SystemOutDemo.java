package cn.itcast_04;

import java.io.PrintStream;

/*
 * ��׼���������
 * System���е�������Ա����
 * 		public static final InputStream in:��׼������
 * 		public static final PrintStream out:��׼�����
 * 
 * 		InputStream is = System.in
 * 		PrintStream ps = System.out
 */
public class SystemOutDemo {
	public static void main(String[] args) {
		System.out.println("helloworld");

		// ��ȡ��׼���������
		PrintStream ps = System.out;// ��ӡ��
		ps.println("helloworld");
	}
}
