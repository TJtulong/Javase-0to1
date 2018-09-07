package cn.itcast_04;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;

import cn.itcast_02.Student;

/*
 * TreeMap<Student,String>
 */
public class TreeMapDemo2 {
	public static void main(String[] args) {
		TreeMap<Student, String> tm = new TreeMap<Student, String>(new Comparator<Student>() {

			@Override
			public int compare(Student s1, Student s2) {
				int num = s2.getAge() - s1.getAge();// 年龄由大到小
				int num2 = num == 0 ? s1.getName().compareTo(s2.getName()) : num;
				return num2;
			}
		});

		Student s1 = new Student("周星驰", 58);
		Student s2 = new Student("刘德华", 55);
		Student s3 = new Student("梁朝伟", 60);
		Student s4 = new Student("刘嘉玲", 63);
		Student s5 = new Student("刘德华", 55);

		tm.put(s1, "香港");
		tm.put(s2, "香港");
		tm.put(s3, "澳门");
		tm.put(s4, "大陆");
		tm.put(s5, "香港");

		Set<Student> set = tm.keySet();
		for (Student key : set) {
			String value = tm.get(key);
			System.out.println(key.getName() + "---" + key.getAge() + "---" + value);
		}
	}
}
