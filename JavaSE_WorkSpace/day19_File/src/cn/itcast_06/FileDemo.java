package cn.itcast_06;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * 获取功能：
 * 		public String getAbsolutePath():获取绝对路径
 * 		public String getPath()：获取相对路径
 * 		public String getName()：获取名称
 * 		public long length()：获取长度（字节）
 * 		public long lastModified()：获取上一次的修改实现，返回毫秒值
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
