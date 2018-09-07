package cn.itcast_02;

import java.lang.reflect.Constructor;

/*
 * 通过反射获取私有构造方法并使用
 */
public class ReflectDemo3 {
	public static void main(String[] args) throws Exception {
		Class c = Class.forName("cn.itcast_01.Person");

		// NoSuchMethodException
		// IllegalAccessException
		Constructor con = c.getDeclaredConstructor(String.class);

		// 暴力访问
		con.setAccessible(true);// 取消java语言访问检查

		Object obj = con.newInstance("椰子皮");

		System.out.println(obj);
	}
}
