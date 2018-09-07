class Student{
	public void show(){
		System.out.println("study");
	}
}

class StudentDemo{
	public void method(Student s){
		s.show();
	}
}

class NoNameDemo{
	public static void main(String[] args){
		//带名字对象
		Student s = new Student();
		s.show();
		//匿名对象
		new Student().show();
		new Student().show();//重新调用一次新的对象
		
		//匿名对象作为实际参数
		StudentDemo sd = new StudentDemo();
		sd.method(new Student());
		//改进
		new StudentDemo().method(new Student());
	}
}