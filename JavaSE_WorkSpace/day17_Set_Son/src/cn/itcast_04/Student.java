package cn.itcast_04;

/*
 * 如果一个类的元素想要能够自然排序，就要实现自然排序接口
 */
public class Student implements Comparable<Student> {
	private String name;
	private int age;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [Name=" + name + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Student s) {
		// return 0;
		// 按照年龄排序
		int num = this.age - s.age;
		// 次要条件
		int num2 = num == 0 ? this.name.compareTo(s.name) : num;
		return num2;
	}
}
