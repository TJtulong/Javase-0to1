package cn.itcast_01;

public class Student {
	private String Name;
	private int age;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int age) {
		super();
		Name = name;
		this.age = age;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [Name=" + Name + ", age=" + age + "]";
	}

	@Override
	public int hashCode() {
		// return 0;
		// 因为成员变量值影响了哈希值，因此把成员变量值相加即可
		// return this.Name.hashCode()+this.age;
		// 为了尽可能地区分，把他们乘以整数
		return this.Name.hashCode() + this.age * 15;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (Name == null) {
			if (other.Name != null)
				return false;
		} else if (!Name.equals(other.Name))
			return false;
		if (age != other.age)
			return false;
		return true;
	}

}
