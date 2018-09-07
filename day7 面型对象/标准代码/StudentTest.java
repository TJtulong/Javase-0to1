/*
标准代码
学生类：成员变量：name age
		构造方法：无参 两个参数
		成员方法：getXxx()/setXxx()/show()
*/

class Student{
	private String name;
	private int age;
	public Student(){}

	public Student(String name,int age){
		//System.out.println("这是带多个类型的构造方法");
		this.age = age;
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public int getAge(){
		return age;
	}
	
	public void setAge(int age){
		this.age = age;
	}
	
	public void show(){
		System.out.println(name+"---"+age);
	}
}

//测试类
class StudentTest{
	public static void main(String[] args){
		Student s1 = new Student();
		s1.setName("王若潇");
		s1.setAge(22);
		System.out.println(s1.getName()+"---"+s1.getAge());
		s1.show();
		
		Student s2 = new Student("王若潇",22);
		s2.show();
	}
}




