class Person{
	public void eat(){
		System.out.println("�Է�");
	}
	public void sleep(){
		System.out.println("˯��");
	}
}

class Student extends Person{}
class Teacher extends Person{}

class ExtendsDemo{
	public static void main(String[] args){
		Student s = new Student();
		Teacher t = new Teacher();
		s.eat();
		s.sleep();
		t.eat();
		t.sleep();
	}
}