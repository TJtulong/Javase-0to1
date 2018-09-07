package cn.itcast_01;

public class Person {
	private String name;
	int age;
	public String address;

	public Person() {
	}

	public Person(String name, int age,String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	private Person(String name) {
		this.name=name;
	}

	public void show() {
		System.out.println("show");
	}

	public void method(String s) {
		System.out.println("method" + s);
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", address=" + address + "]";
	}
	
	
}
