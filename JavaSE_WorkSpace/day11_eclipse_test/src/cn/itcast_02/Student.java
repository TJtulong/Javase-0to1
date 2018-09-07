package cn.itcast_02;

public class Student {
	private String name;
	private int age;
	public int num = 10;
	public final int num2 =10;
	public static final int num3 = 100;
	public Student() {}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
}
