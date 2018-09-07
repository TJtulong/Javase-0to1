package cn.itcast_05;

import java.util.Comparator;
import java.util.TreeSet;

/*
 * TreeSet储存自定义对象并排序
 * 1.按照什么顺序排序：按照姓名长度
 * 2.什么算同一个元素：姓名年龄相同
 */
public class TreeSetDemo2 {
	public static void main(String[] args) {
		// TreeSet<Student> ts = new TreeSet<Student>();默认为自然排序

		// 比较器排序
		// TreeSet<Student> ts = new TreeSet<Student>(new MyComparator());

		// 用匿名内部类实现
		TreeSet<Student> ts = new TreeSet<Student>(new Comparator<Student>() {
			public int compare(Student s1, Student s2) {
				int num = s1.getName().length() - s2.getName().length();
				int num2 = num == 0 ? s1.getName().compareTo(s2.getName()) : num;
				int num3 = num2 == 0 ? s1.getAge() - s2.getAge() : num2;

				return num3;
			}
		});

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
