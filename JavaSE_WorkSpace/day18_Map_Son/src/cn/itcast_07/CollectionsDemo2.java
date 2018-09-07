package cn.itcast_07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 * Collections对自定义对象排序
 */
public class CollectionsDemo2 {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();

		Student s1 = new Student("周星驰", 58);
		Student s2 = new Student("刘德华", 55);
		Student s3 = new Student("梁朝伟", 60);
		Student s4 = new Student("刘嘉玲", 63);
		Student s5 = new Student("刘德华", 55);

		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);

		// Collections.sort(list);
		// 比较器排序
		Collections.sort(list, new Comparator<Student>() {

			@Override
			public int compare(Student s1, Student s2) {
				return 0;
			}
		});
		// 如果同时有自然排序和比较器排序，以比较器排序为主

		for (Student s : list) {
			System.out.println(s.getName() + "---" + s.getAge());
		}
	}
}
