/*
面试题：fianl修饰局部变量的问题
*/

class Student{
	int age = 10;
}

class FinalTest{
	public static void main(String[] args){
		//局部变量是基本数据类型
		int x = 10;
		x = 100;
		System.out.println(x);
		final int y = 10;
		//y = 100;  无法为最终变量y分配值
		System.out.println(y);
		
		//局部变量是引用数据类型
		Student s = new Student();
		System.out.println(s.age);
		s.age = 100;
		System.out.println(s.age);
		
		final Student ss = new Student();
		System.out.println(ss.age);
		ss.age = 100;
		System.out.println(ss.age);//与上面输出结果一样
		
		//重新分配内存空间,不可以
		ss = new Student();
	}
}