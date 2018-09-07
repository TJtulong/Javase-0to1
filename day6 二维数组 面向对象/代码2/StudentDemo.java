/*
在一个java文件中写两个类：一个基本的类，一个测试类
注意：文件名称和测试类名称一致
*/
class Student{ //基本类
	//定义变量
	String name; //null
	int age; //0
	String address; //null
	//定义方法
	public void study(){
		System.out.println("学生爱学习");
	}
	
	public void eat(){
		System.out.println("学生要吃饭");
	}
	
	public void sleep(){
		System.out.println("学生要睡觉");
	}
}

class StudentDemo{
	public static void main(String[] args){
		//创建对象格式：类名 对象名 = new 类名()；
		Student s = new Student();
		//使用变量：对象名.变量名 对象名.方法名
		System.out.println(s.name);
		System.out.println(s.age);
		//给成员变量赋值
		s.name="林青霞";
		s.age=27;
		s.address="北京";
		System.out.println(s.name+"---"+s.age+"---"+s.address);
		//调用方法
		s.study();
		s.eat();
		s.sleep();
	}
}

