package cn.itcast_02;

import java.lang.reflect.Constructor;

/*
 * ͨ�������ȡ˽�й��췽����ʹ��
 */
public class ReflectDemo3 {
	public static void main(String[] args) throws Exception {
		Class c = Class.forName("cn.itcast_01.Person");

		// NoSuchMethodException
		// IllegalAccessException
		Constructor con = c.getDeclaredConstructor(String.class);

		// ��������
		con.setAccessible(true);// ȡ��java���Է��ʼ��

		Object obj = con.newInstance("Ҭ��Ƥ");

		System.out.println(obj);
	}
}
