package cn.itcast_03;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/*
 * ͨ�������ȡ��Ա������ʹ��
 */
public class ReflectDemo {
	public static void main(String[] args) throws Exception {
		Class c = Class.forName("cn.itcast_01.Person");
		// ��ȡ���г�Ա����
		Field[] fields = c.getDeclaredFields();

		for (Field field : fields) {
			System.out.println(field);
		}

		Constructor con = c.getConstructor();
		Object obj = con.newInstance();

		// ��ȡ������Ա����
		Field addressField = c.getField("address");
		// ������ֵ public void set(Object obj,Object value)
		addressField.set(obj, "����");
		System.out.println(obj);

		// ��ȡ����˽�г�Ա����
		Field nameField = c.getDeclaredField("name");
		nameField.setAccessible(true);
		nameField.set(obj, "Ҭ��Ƥ");
		System.out.println(obj);

	}
}
