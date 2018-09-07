package cn.itcast_05;

import java.io.IOException;
import java.io.RandomAccessFile;

/*
 * �����������
 * ֧�ֶ��ļ���������ʼ�д��
 * 
 * public RandomAccessFile(String name,String mode)
 * ��һ���������ļ�·�����ڶ��������ǲ����ļ���ģʽ
 * ģʽ�����֣���õ�Ϊ"rw"���ȿ���дҲ���Զ�����
 */
public class RandomAccessFileDemo {
	public static void main(String[] args) throws IOException {
		// write();
		read();
	}

	private static void read() throws IOException {
		RandomAccessFile raf = new RandomAccessFile("raf.txt", "rw");

		int i = raf.readInt();
		System.out.println(i);
		System.out.println("��ǰ�ļ���ָ��λ����" + raf.getFilePointer());// 4

		char ch = raf.readChar();
		System.out.println(ch);
		System.out.println("��ǰ�ļ���ָ��λ����" + raf.getFilePointer());// 6

		String s = raf.readUTF();
		System.out.println(s);
		System.out.println("��ǰ�ļ���ָ��λ����" + raf.getFilePointer());// 14=6+3*2+2

		// ֱ�Ӷ�ȡa
		raf.seek(4);
		char ch1 = raf.readChar();
		System.out.println(ch); // a
	}

	private static void write() throws IOException {
		RandomAccessFile raf = new RandomAccessFile("raf.txt", "rw");

		raf.writeInt(100);
		raf.writeChar('a');
		raf.writeUTF("�й�");

		raf.close();
	}
}
