package cn.itcast_04;

import java.util.TreeSet;

/*
 * TreeSet储存自定义对象并排序
 * 1.按照什么顺序排序：按照年龄从小到大
 * 2.什么算同一个元素：姓名年龄相同
 */
public class TreeSetDemo2 {
	public static void main(String[] args) {
		TreeSet<Student> ts = new TreeSet<Student>();

		Student s1 = new Student("wangruoxiao", 22);
		Student s2 = new Student("wuqilong", 40);
		Student s3 = new Student("linqingxia", 27);
		Student s4 = new Student("zhurui", 30);
		Student s5 = new Student("linqingxia", 27);
		Student s6 = new Student("wangruoxia", 22);

		ts.add(s1);
		ts.add(s2);
		ts.add(s3);
		ts.add(s4);
		ts.add(s5);
		ts.add(s6);

		for (Student s : ts) {
			System.out.println(s.getName() + "---" + s.getAge());
		}
	}
}
