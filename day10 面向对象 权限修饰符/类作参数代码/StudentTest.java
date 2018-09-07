/*
形式参数：
	基本类型
	引用类型
		类（匿名对象）需要的是该类的对象
		抽象类
		接口
*/

class Student{
	public void study(){
		System.out.println("好好学习");
	}
}

class StudentDemo{
	public void method(Student s){
		s.study();
	}
}

class StudentTest{
	public static void main(String[] args){
		Student s = new Student();
		s.study();
		System.out.println("--------");
		StudentDemo sd = new StudentDemo();
		s = new Student();
		sd.method(s);
		//匿名对象用法
		new StudentDemo().method(new Student());
	}
}