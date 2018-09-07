package cn.itcast_07;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/*
 * ���л������Ѷ�������һ���ķ�ʽ�����ı��ļ������������д��� ObjectOutputStream
 * ����--->������
 * �����л���ObjectInputStream
 * 
 * �޸Ķ���ᱨ��InvalidClassException
 * ���л��ӿڱ��ֵid�ı�
 * ʹidֵ��Ϊһ���̶���ֵ
 */
public class ObjectStreamDemo {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		write();
		read();
	}

	private static void read() throws IOException, ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("oos.txt"));
		Object obj = ois.readObject();// ��̬
		ois.close();
		System.out.println(obj);
	}

	private static void write() throws IOException {
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("oos.txt"));

		Student s = new Student("������", 22);

		oos.writeObject(s);

		oos.close();
	}
}
