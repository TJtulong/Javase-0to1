package cn.itcast_02;

import java.io.File;
import java.io.IOException;

/*
 * �������ܣ�
 * 		public boolean createNewFile():�����ļ�
 * 		public boolean mkdir():�����ļ���,������ھͲ������ˣ�����false
 * 		public boolean mkdirs():�����ļ���,������ļ��в����ڣ����Զ�����
 */
public class FileDemo {
	public static void main(String[] args) throws IOException {
		// �����洴���ļ���demo
		File file = new File("c:\\Users\\TJtulong\\Desktop\\demo");
		System.out.println("mkdir:" + file.mkdir());

		// ��demo�ļ����´���a.txt
		File file2 = new File("c:\\Users\\TJtulong\\Desktop\\demo\\a.txt");
		System.out.println("createnewfile:" + file2.createNewFile());

		// ������textĿ¼�´���b.txt
		// Exception in thread "main" java.io.IOException
		// �Ƚ�Ŀ¼���ڴ����ļ�
		// File file3=new File("c:\\Users\\TJtulong\\Desktop\\test\\b.txt");
		// System.out.println("createnewfile:"+file3.createNewFile());

		// ������testĿ¼�´���aaaĿ¼
		File file4 = new File("c:\\Users\\TJtulong\\Desktop\\test\\aaa");
		System.out.println("mkdir:" + file4.mkdir());// mkdir:false

		/*
		 * File file5=new File("c:\\Users\\TJtulong\\Desktop\\test"); File file6=new
		 * File("c:\\Users\\TJtulong\\Desktop\\test\\aaa");
		 * System.out.println("mkdir:"+file5.mkdir());
		 * System.out.println("mkdir:"+file6.mkdir());
		 */

		File file7 = new File("c:\\Users\\TJtulong\\Desktop\\test\\aaa");
		System.out.println("mkdir:" + file7.mkdirs());

		File file8 = new File("c:\\Users\\TJtulong\\Desktop\\test\\a.txt");
		System.out.println("mkdir:" + file8.mkdirs());
		// ������a.txt�ļ���
	}
}
