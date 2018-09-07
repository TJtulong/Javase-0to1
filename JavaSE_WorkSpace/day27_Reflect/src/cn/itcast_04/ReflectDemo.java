package cn.itcast_04;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ReflectDemo {
	public static void main(String[] args) throws Exception {
		Class c = Class.forName("cn.itcast_01.Person");

		// ��ȡ���з���
		// Method[] methods = c.getMethods();//��ȡ������������з���
		Method[] methods = c.getDeclaredMethods();// ��ȡ�Լ��ķ���

		// ��ȡ��������
		Constructor con = c.getConstructor();
		Object obj = con.newInstance();

		// ��ȡ��������
		Method m1 = c.getMethod("show");
		// invoke
		m1.invoke(obj);
	}
}
