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
		// ��Ϊ��Ա����ֵӰ���˹�ϣֵ����˰ѳ�Ա����ֵ��Ӽ���
		// return this.Name.hashCode()+this.age;
		// Ϊ�˾����ܵ����֣������ǳ�������
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
