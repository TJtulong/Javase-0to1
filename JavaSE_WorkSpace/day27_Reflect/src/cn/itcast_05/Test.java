package cn.itcast_05;

import java.io.FileReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Properties;

/*
 * ͨ�������ļ��������еķ���
 * ���䣺
 * ��Ҫ�������ļ����ʹ��
 * ��class.txt����
 * ��������className  methodName
 */
public class Test {
	public static void main(String[] args) throws Exception{
		//���ؼ�ֵ��
		Properties prop = new Properties();
		FileReader fr = new FileReader("class.txt");
		prop.load(fr);
		fr.close();
		
		//��ȡ����
		String className =prop.getProperty("className");
		String methodName = prop.getProperty("methodName");
		
		Class c = Class.forName(className);
		Constructor con = c.getConstructor();
		Object obj = con.newInstance();
		
		Method m = c.getMethod(methodName);
		m.invoke(obj);
	}
}
