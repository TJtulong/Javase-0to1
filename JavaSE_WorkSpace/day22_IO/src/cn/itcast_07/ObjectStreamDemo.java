package cn.itcast_07;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/*
 * 序列化流：把对象按照流一样的方式存入文本文件或者在网络中传输 ObjectOutputStream
 * 对象--->流数据
 * 反序列化：ObjectInputStream
 * 
 * 修改对象会报错：InvalidClassException
 * 序列化接口标记值id改变
 * 使id值变为一个固定的值
 */
public class ObjectStreamDemo {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		write();
		read();
	}

	private static void read() throws IOException, ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("oos.txt"));
		Object obj = ois.readObject();// 多态
		ois.close();
		System.out.println(obj);
	}

	private static void write() throws IOException {
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("oos.txt"));

		Student s = new Student("王若潇", 22);

		oos.writeObject(s);

		oos.close();
	}
}
