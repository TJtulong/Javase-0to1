package cn.itcast_02;

/*
 * public String toString():返回该对象的字符串表示
 * Integer类下的一个静态方法：
 * 		public static String toHexString(int i):把一个整数转换为16进制
 * 这个信息是没有意义的，要重写该方法
 * 		把该类的所有成员变量值返回即可
 * 		自动生成toString()方法
 * 		直接输出一个对象的名称，其实就是调用该对象的toString()方法
 */
public class StudentDemo {
	public static void main(String[] args) {
		Student s = new Student();
		System.out.println(s.hashCode());
		System.out.println(s.getClass().getName());
		System.out.println("------------");
		System.out.println(s.toString());// cn.itcast_02.Student@7852e922

		// toString()方法的值等价于
		// getClass().getName() + '@' + Integer.toHexString(hashCode())

		System.out.println(s.getClass().getName() + "@" + Integer.toHexString(s.hashCode()));
		// cn.itcast_02.Student@7852e922
		
		//直接输出对象名称
		System.out.println(s);//Student [name=null, age=0]
	}
}
