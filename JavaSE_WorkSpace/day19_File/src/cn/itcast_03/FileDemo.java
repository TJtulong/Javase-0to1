package cn.itcast_03;

import java.io.File;
import java.io.IOException;

/*
 * ע�⣺��������ļ���Ŀ¼����д�̷�·����Ĭ������Ŀ·����
 * ɾ�����ܣ�public boolean delete();
 * ע�⣺java�е�ɾ�����߻���վ
 * 		Ҫɾ��һ���ļ���ʱ�����ļ����ڲ������ļ����ļ���
 */
public class FileDemo {
	public static void main(String[] args) throws IOException {
		// ɾ������
		File file = new File("a.txt");
		file.createNewFile();
		System.out.println("delete:" + file.delete());

		File file2 = new File("c:\\Users\\TJtulong\\Desktop\\test\\aaa");
		file2.delete();
	}
}
