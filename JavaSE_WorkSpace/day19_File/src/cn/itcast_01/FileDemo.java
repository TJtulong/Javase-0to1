package cn.itcast_01;

import java.io.File;

/*
 * File:���ļ���·�����ĳ�������ʽ
 * ���췽����(Ч����ͬ)
 * 		File(String pathname):·�����죨���ã�
 * 		File(String pathname,String child)����һ��Ŀ¼��һ�����ļ��õ�File����
 * 		File(File parent,String child)����һ����file��������ļ��õ�File����
 */
public class FileDemo {
	public static void main(String[] args) {
		// File(String pathname)
		File file = new File("C:\\Users\\TJtulong\\Desktop\\a.txt");
		// �����Ǵ�����ֻ�ǳ������ʽ

		// File(String pathname,String child)
		File file2 = new File("C:\\Users\\TJtulong\\Desktop", "a.txt");

		// File(File parent,String child)
		File file3 = new File("C:\\Users\\TJtulong\\Desktop");
		File file4 = new File(file3, "a.txt");
	}
}
