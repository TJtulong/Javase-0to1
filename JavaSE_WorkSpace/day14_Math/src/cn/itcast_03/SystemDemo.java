package cn.itcast_03;
/*
 * System类包含一些有用的类字段和方法，它不能被实例化
 * 方法：
 * 		public static void gc()
 */
public class SystemDemo {
	public static void main(String[] args) {
		Person p = new Person("xiao",22);
		System.out.println(p);
		
		p=null;
		System.gc();//当前对象被回收了Person [name=xiao, age=22]
	}
}
