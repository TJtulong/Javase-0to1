package cn.itcast_03;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/*
 * 通过反射获取成员变量并使用
 */
public class ReflectDemo {
	public static void main(String[] args) throws Exception {
		Class c = Class.forName("cn.itcast_01.Person");
		// 获取所有成员变量
		Field[] fields = c.getDeclaredFields();

		for (Field field : fields) {
			System.out.println(field);
		}

		Constructor con = c.getConstructor();
		Object obj = con.newInstance();

		// 获取单个成员变量
		Field addressField = c.getField("address");
		// 给对象赋值 public void set(Object obj,Object value)
		addressField.set(obj, "沈阳");
		System.out.println(obj);

		// 获取单个私有成员变量
		Field nameField = c.getDeclaredField("name");
		nameField.setAccessible(true);
		nameField.set(obj, "椰子皮");
		System.out.println(obj);

	}
}
