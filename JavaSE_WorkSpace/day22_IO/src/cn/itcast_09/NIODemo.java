package cn.itcast_09;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

/*
 * NIO包在JDK4出现，提高了IO流的操作效率
 * 
 * JDK7后的NIO
 * Path：路径
 * Paths：有一个静态方法返回路径
 * 		public static Psth get(URI uri)
 * Files：提供了静态方法供我们使用
 */
public class NIODemo {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		//复制文件
		Files.copy(Paths.get("dos.txt"), new FileOutputStream("copy.txt"));
		
		ArrayList<String> array = new ArrayList<>();
		array.add("hello");
		array.add("world");
		array.add("java");
		
		Files.write(Paths.get("array.txt"), array,Charset.forName("GBK"));
	}
}
