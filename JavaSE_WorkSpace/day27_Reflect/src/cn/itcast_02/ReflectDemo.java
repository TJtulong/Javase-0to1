package cn.itcast_02;

import java.lang.reflect.Constructor;

/*
 * ͨ�������ȡ���췽����ʹ��
 */
public class ReflectDemo {
	public static void main(String[] args) throws Exception {
		// ��ȡ�ֽ����ļ�����
		Class c = Class.forName("cn.itcast_01.Person");

		// ��ȡ���췽��
		// public Constructor[] getConstructors()�����й������췽��
		// public Constructor[] getDeclaredConstructors:���й��췽��
		// Constructor[] cons =c.getConstructors();
		Constructor[] cons = c.getDeclaredConstructors();
		for (Constructor con : cons) {
			System.out.println(con);
		}

		// ��ȡ�������췽��
		Constructor con = c.getConstructor();
		Object obj = con.newInstance();
		System.out.println(obj);
	}
}
