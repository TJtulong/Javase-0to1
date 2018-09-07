package cn.itcast_07;

import java.io.Serializable;

/*
 * NotSerializableExceptionδ���л��쳣
 * �����������л��ӿ�Serializable
 * �ýӿ�û�з�����û�з����Ľӿڱ���Ϊ��ǽӿ�
 * 
 * һ�������ж����Ա����������ò��ֳ�Ա�������л�
 * transient�ؼ�����������Ҫ���л��ĳ�Ա����
 */
public class Student implements Serializable {
	private static final long serialVersionUID = 6210569037427281918L;
	private String name;
	private transient int age;// age=0

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
}
