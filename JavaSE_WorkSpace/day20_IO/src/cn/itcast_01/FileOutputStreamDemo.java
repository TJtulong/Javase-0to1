package cn.itcast_01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 如果没有明确说明按照哪种分类来说，默认按照数据类型分类，不是按流向
 * 超累（抽象类）
 * 字节输入流：InputStream
 * 字节输出流: OutPutStream JDK1.0
 * 字符输入流: Reader
 * 字符输出流: Writer
 * 
 * 需求：向一个文本文件中输入"hello IO"
 * OutputStream是抽象类，不能实例化，需要找一个具体的子类FileOutputStream
 * 每种基类的子类都是以父类名作为后缀名
 * 
 * 构造方法:
 * 		FileOutputStream(File file)
 * 		FileOutputStream(String name)
 */
public class FileOutputStreamDemo {
	public static void main(String[] args) throws IOException {
		//创建字节输出流对象(两种方式)
		//File file = new File("file.txt");
		//FileOutputStream fos = new FileOutputStream(file);
		
		FileOutputStream fos = new FileOutputStream("fos.txt");
		/*
		 * 创建字节输出流做了以下事情：
		 * 1.调用系统功能创建文件
		 * 2.创建fos对象
		 * 3.把fos对象指向文件
		 */
		
		//写数据
		fos.write("Hello,IO".getBytes());
		
		//释放资源
		fos.close();
		/*
		 * 为什么一定要close
		 * 1.让流对象变成垃圾，可以被垃圾回收器回收
		 * 2.通知系统去释放该文件相关的资源
		 */
		//fos.write("java".getBytes());报错
	}
}
