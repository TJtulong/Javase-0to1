package cn.itcast_07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 * Collections���Զ����������
 */
public class CollectionsDemo2 {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();

		Student s1 = new Student("���ǳ�", 58);
		Student s2 = new Student("���»�", 55);
		Student s3 = new Student("����ΰ", 60);
		Student s4 = new Student("������", 63);
		Student s5 = new Student("���»�", 55);

		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);

		// Collections.sort(list);
		// �Ƚ�������
		Collections.sort(list, new Comparator<Student>() {

			@Override
			public int compare(Student s1, Student s2) {
				return 0;
			}
		});
		// ���ͬʱ����Ȼ����ͱȽ��������ԱȽ�������Ϊ��

		for (Student s : list) {
			System.out.println(s.getName() + "---" + s.getAge());
		}
	}
}
