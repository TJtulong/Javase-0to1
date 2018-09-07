package cn.itcast_02;

import java.lang.reflect.Constructor;

/*
 * 通过反射获取构造方法并使用
 */
public class ReflectDemo {
	public static void main(String[] args) throws Exception {
		// 获取字节码文件对象
		Class c = Class.forName("cn.itcast_01.Person");

		// 获取构造方法
		// public Constructor[] getConstructors()：所有公共构造方法
		// public Constructor[] getDeclaredConstructors:所有构造方法
		// Constructor[] cons =c.getConstructors();
		Constructor[] cons = c.getDeclaredConstructors();
		for (Constructor con : cons) {
			System.out.println(con);
		}

		// 获取单个构造方法
		Constructor con = c.getConstructor();
		Object obj = con.newInstance();
		System.out.println(obj);
	}
}
