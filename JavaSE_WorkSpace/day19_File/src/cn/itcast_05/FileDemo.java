package cn.itcast_05;

import java.io.File;

/*
 * �жϹ��ܣ�
 * 		public boolean isDictionary():�ж��Ƿ���Ŀ¼
 * 		public boolean isFile():�ж��Ƿ����ļ�
 * 		public boolean exists():�ж��Ƿ��Ǵ���
 * 		public boolean canRead():�ж��Ƿ�ɶ�
 * 		public boolean canWrite():�ж��Ƿ��д
 * 		public boolean isHidden();�ж��Ƿ�����
 */
public class FileDemo {
	public static void main(String[] args) {
		File file = new File("a.txt");
		System.out.println(file.isDirectory());// false
		System.out.println(file.isFile());// true
		System.out.println(file.exists());// true
		System.out.println(file.canRead());// true
		System.out.println(file.canWrite());// trueֻ��
		System.out.println(file.isHidden());// false����
	}
}
