package cn.itcast_07;

import java.io.Serializable;

/*
 * NotSerializableException未序列化异常
 * 必须启用序列化接口Serializable
 * 该接口没有方法，没有方法的接口被成为标记接口
 * 
 * 一个类中有多个成员变量，如何让部分成员不被序列化
 * transient关键字声明不需要序列化的成员变量
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
