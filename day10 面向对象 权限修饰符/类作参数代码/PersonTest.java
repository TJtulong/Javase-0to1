abstract class Person{
	public abstract void study();
}

class PersonDemo{
	public void method(Person p){
		p.study();
	}
}

//�ȶ���һ��������
class Student extends Person{
	public void study(){
		System.out.println("�ú�ѧϰ");
	}
}
class PersonTest{
	public static void main(String[] args){
		PersonDemo pd = new PersonDemo();
		Person p = new Student();
		pd.method(p);
	}
}