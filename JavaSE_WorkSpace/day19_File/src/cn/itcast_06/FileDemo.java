package cn.itcast_06;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * ��ȡ���ܣ�
 * 		public String getAbsolutePath():��ȡ����·��
 * 		public String getPath()����ȡ���·��
 * 		public String getName()����ȡ����
 * 		public long length()����ȡ���ȣ��ֽڣ�
 * 		public long lastModified()����ȡ��һ�ε��޸�ʵ�֣����غ���ֵ
 */
public class FileDemo {
	public static void main(String[] args) {
		File file = new File("demo\\test.txt");
		
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getPath());
		System.out.println(file.getName());
		System.out.println(file.length());
		System.out.println(file.lastModified());
		
		Date d= new Date(file.lastModified());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy--MM-dd HH:mm:ss");
		String s = sdf.format(d);
		System.out.println(s);
	}
}
