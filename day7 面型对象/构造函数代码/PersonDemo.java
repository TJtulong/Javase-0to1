//针对多个对象有共同的成员变量值时，java提供关键字static修饰
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
		System.out.println("姓名"+name+",年龄"+age+",国籍"+country);
	}
}

class PersonDemo{
	public static void main(String[] args){
		Person p1 = new Person("王若潇",22,"中国");
		p1.show();//姓名王若潇,年龄22,国籍中国
		Person p2 = new Person("C罗",33);
		p2.show();//姓名C罗,年龄33,国籍中国
		Person p3 = new Person("梅西",33,"阿根廷");
		p3.show();//姓名梅西,年龄33,国籍阿根廷
		p1.show();//姓名王若潇,年龄22,国籍阿根廷
		p2.show();//姓名C罗,年龄33,国籍阿根廷
	}
}