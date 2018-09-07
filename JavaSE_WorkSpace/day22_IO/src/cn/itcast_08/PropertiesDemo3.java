package cn.itcast_08;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.Properties;

/*
 * public void load(Reader reader):���ļ��е����ݶ�ȡ��������
 * public void store(Writer writer,String comment):�Ѽ����е����ݴ洢���ļ���
 */
public class PropertiesDemo3 {
	public static void main(String[] args) throws IOException {
		// load();
		store();
	}

	private static void store() throws IOException {
		Properties prop = new Properties();

		prop.setProperty("it002", "hello");
		prop.setProperty("it001", "world");
		prop.setProperty("it003", "java");

		Writer w = new FileWriter("prop.txt");
		prop.store(w, "helloworld");
		w.close();
	}

	private static void load() throws IOException {
		Properties prop = new Properties();

		// public void load(Reader reader)
		// �ļ��е����ݱ����Ǽ�ֵ����ʽ
		Reader r = new FileReader("prop.txt");
		prop.load(r);
		r.close();

		System.out.println("prop=" + prop);
	}
}
