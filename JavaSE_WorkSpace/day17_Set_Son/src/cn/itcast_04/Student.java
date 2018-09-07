package cn.itcast_04;

/*
 * ���һ�����Ԫ����Ҫ�ܹ���Ȼ���򣬾�Ҫʵ����Ȼ����ӿ�
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
		// ������������
		int num = this.age - s.age;
		// ��Ҫ����
		int num2 = num == 0 ? this.name.compareTo(s.name) : num;
		return num2;
	}
}