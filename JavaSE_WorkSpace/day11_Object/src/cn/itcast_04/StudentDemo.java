package cn.itcast_04;

/*
 * protected void finalize()
 * 		当垃圾回收器确定不存在对该对象的更多引用时，由对象的垃圾回收器调用此方法
 * protected Object clone()
 * 		创建并返回此对象的一个副本
 * 		重写该方法
 * 
 * Cloneable:此类实现了Cloneable接口，以指式Object.clone()可以合法的对该类实例进行字段复制
 * 		这个接口是标记接口
 */
public class StudentDemo {
	public static void main(String[] args) throws CloneNotSupportedException {
		// 创建学生对象
		Student s = new Student();
		s.setName("xiao");
		s.setAge(22);
		// 克隆学生对象
		Object obj = s.clone();
		Student s2 = (Student) obj;

		System.out.println(s.getName() + "---" + s.getAge());
		System.out.println(s2.getName() + "---" + s2.getAge());

		Student s3 = s;
		s3.setName("feng");
		s3.setAge(30);
		System.out.println(s.getName() + "---" + s.getAge());// feng---30
		System.out.println(s2.getName() + "---" + s2.getAge());// xiao---22不变
		System.out.println(s3.getName() + "---" + s3.getAge());// feng---30
	}
}
