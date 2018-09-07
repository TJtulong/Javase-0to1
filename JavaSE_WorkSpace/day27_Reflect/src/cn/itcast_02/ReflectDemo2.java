package cn.itcast_02;

import java.lang.reflect.Constructor;

/*
 * 通过反射获取带参构造并使用
 */
public class ReflectDemo2 {
	public static void main(String[] args) throws Exception{
		Class c = Class.forName("cn.itcast_01.Person");
		
		//获取带参构造器
		Constructor con = c.getConstructor(String.class,int.class,String.class);
		
		//创建对象
		Object obj = con.newInstance("椰子皮",22,"沈阳");
		System.out.println(obj);
	}
}
