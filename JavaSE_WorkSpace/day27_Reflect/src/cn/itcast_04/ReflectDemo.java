package cn.itcast_04;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ReflectDemo {
	public static void main(String[] args) throws Exception {
		Class c = Class.forName("cn.itcast_01.Person");

		// 获取所有方法
		// Method[] methods = c.getMethods();//获取包括父类的所有方法
		Method[] methods = c.getDeclaredMethods();// 获取自己的方法

		// 获取单个方法
		Constructor con = c.getConstructor();
		Object obj = con.newInstance();

		// 获取单个方法
		Method m1 = c.getMethod("show");
		// invoke
		m1.invoke(obj);
	}
}
