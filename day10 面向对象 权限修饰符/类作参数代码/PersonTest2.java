abstract class Person{
	public abstract void study();
}

class PersonDemo{
	public Person getPerson(){
		return new Student();
	}
}

class Student extends Person{
	public void study(){
		System.out.print("ѧϰ");
	}
}

class PersonTest2{
	public static void main(String[] args){
		PersonDemo pd = new PersonDemo();
		Person p = pd.getPerson();
		p.study();
	}
}