package cn.itcast_07;

import java.io.File;

/*
 * ��ȡ���ܣ�
 * 		public String[] list():��ȡָ��Ŀ¼�µ������ļ������ļ��е���������
 * 		public File[] listFiles():��ȡָ��Ŀ¼�µ������ļ������ļ��е�File����
 */
public class FileDemo {
	public static void main(String[] args) {
		File file = new File("c:\\Users\\TJtulong\\Desktop");
		
		String[] strArray=file.list();
		for(String s:strArray) {
			System.out.println(s);
		}
		System.out.println("------------");
		
		File[] fileArray = file.listFiles();
		for(File f:fileArray) {
			System.out.println(f.getName());
		}
	}
}
