abstract class Person{
	public abstract void study();
}

class PersonDemo{
	public void method(Person p){
		p.study();
	}
}

//先定义一个具体类
class Student extends Person{
	public void study(){
		System.out.println("好好学习");
	}
}
class PersonTest{
	public static void main(String[] args){
		PersonDemo pd = new PersonDemo();
		Person p = new Student();
		pd.method(p);
	}
}