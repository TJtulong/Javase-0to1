package cn.itcast_03;

public class Student {
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

	// return super.equals(obj);
	// String是引用类型，用equals()比较
	// String的equals方法是重写自Object类的，比较的字符串的内容
	// obj要向下转型
	@Override
	public boolean equals(Object obj) {
		// 为了提高效率
		if (this == obj) {
			return true;
		}

		// 为了提高代码的健壮性，先判断obj是否为学生对象，不是直接返回false
		//对象名 instanceof 类名  判断对象名是否为类的对象
		if(!(obj instanceof Student)) {
			return false;
		}
		
		Student s = (Student) obj;
		/*
		 * if(this.name.equals(s.name) && this.age == s.age) { return true; }else {
		 * return false; }
		 */
		return this.name.equals(s.name) && this.age == s.age;
	}
	//可以自动生成
}
