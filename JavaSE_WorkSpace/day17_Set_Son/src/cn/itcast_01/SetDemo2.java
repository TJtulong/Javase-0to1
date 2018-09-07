package cn.itcast_01;

import java.util.HashSet;

/*
 * 需求：储存自定义对象并遍历
 * 需求：如果对象的成员变量值都相同，则为同一个元素
 */
public class SetDemo2 {
	public static void main(String[] args) {
		HashSet<Student> hs = new HashSet<Student>();
		
		Student s1=new Student("王若潇",22);
		Student s2=new Student("梅西",31);
		Student s3=new Student("莫德里奇",33);
		Student s4=new Student("莫德里奇",33);
		Student s5=new Student("莫德里奇",35);
		
		hs.add(s1);
		hs.add(s2);
		hs.add(s3);
		hs.add(s4);
		hs.add(s5);
		
		for (Student s:hs) {
			System.out.println(s.getName()+"----"+s.getAge());
		}
	}
}
