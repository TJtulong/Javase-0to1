package cn.itcast_01;

/*
 * 获取class文件对象的方式
 * 1.Object类的getClass()方法
 * 2.数据类型的静态属性class
 * 3.Class类中的静态方法：
 * 			public static Class forName(String className)
 * 			带全路径
 * 自己用：第二种，方便
 * 开发：第三种，字符串可以配置到配置文件中
 */
public class ReflectDemo {
	public static void main(String[] args) throws ClassNotFoundException {
		//方式1
		Person p = new Person();
		Class c = p.getClass();

		Person p2 = new Person();
		Class c2 = p2.getClass();

		System.out.println(p == p2);// false
		System.out.println(c == c2);// true
		
		//方式2
		Class c3 = Person.class;
		
		//方式3
		Class c4=Class.forName("cn.itcast_01.Person");
		System.out.println(c==c4);
	}
}
