//��Զ�������й�ͬ�ĳ�Ա����ֵʱ��java�ṩ�ؼ���static����
class Person{
	String name;
	int age;
	static String country;
	public Person(){}
	public Person(String name,int age){
		this.name = name;
		this.age = age;
	}
	public Person(String name,int age,String country){
		this.name = name;
		this.age = age;
		this.country = country;
	}
	public void show(){
		System.out.println("����"+name+",����"+age+",����"+country);
	}
}

class PersonDemo{
	public static void main(String[] args){
		Person p1 = new Person("������",22,"�й�");
		p1.show();//����������,����22,�����й�
		Person p2 = new Person("C��",33);
		p2.show();//����C��,����33,�����й�
		Person p3 = new Person("÷��",33,"����͢");
		p3.show();//����÷��,����33,��������͢
		p1.show();//����������,����22,��������͢
		p2.show();//����C��,����33,��������͢
	}
}