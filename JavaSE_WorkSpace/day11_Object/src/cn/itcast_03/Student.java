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
	// String���������ͣ���equals()�Ƚ�
	// String��equals��������д��Object��ģ��Ƚϵ��ַ���������
	// objҪ����ת��
	@Override
	public boolean equals(Object obj) {
		// Ϊ�����Ч��
		if (this == obj) {
			return true;
		}

		// Ϊ����ߴ���Ľ�׳�ԣ����ж�obj�Ƿ�Ϊѧ�����󣬲���ֱ�ӷ���false
		//������ instanceof ����  �ж϶������Ƿ�Ϊ��Ķ���
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
	//�����Զ�����
}
