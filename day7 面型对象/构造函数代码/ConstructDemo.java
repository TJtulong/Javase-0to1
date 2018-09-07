/*
构造方法:给对象的数据进行初始化
格式：A：方法名与类名相同
      B：没有返回值类型，连void都没有
	  C：没有具体返回值
系统会自动提供一个无参方法；
如果自己给出了构造方法，系统将不再提供默认的构造方法
给成员变量赋值有两种方法：setXxx; 构造方法
*/
class Student{
	private String name;
	private int age;
	public Student(){
		System.out.println("这是无参构造方法");
	}
	//构造方法的重载格式
	public Student(String name){
		System.out.println("这是带string类型的构造方法");
		this.name = name;
	}
	public Student(int age){
		System.out.println("这是带int类型的构造方法");
		this.age = age;
	}
	public Student(String name,int age){
		System.out.println("这是带多个类型的构造方法");
		this.age = age;
		this.name = name;
	}
	public void show(){
		System.out.println(name+"---"+age);
	}
}

class ConstructDemo{
	public static void main(String[] Args){
		Student s1 = new Student();
		System.out.println(s1);//Student@15db9742
		Student s2 = new Student("王若潇");
		s2.show();
		Student s3 = new Student(22);
		s3.show();
		Student s4 = new Student("王若潇",22);
		s4.show();
	}
}