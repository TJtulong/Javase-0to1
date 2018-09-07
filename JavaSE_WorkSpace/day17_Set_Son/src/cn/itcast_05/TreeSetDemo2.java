package cn.itcast_05;

import java.util.Comparator;
import java.util.TreeSet;

/*
 * TreeSet�����Զ����������
 * 1.����ʲô˳�����򣺰�����������
 * 2.ʲô��ͬһ��Ԫ�أ�����������ͬ
 */
public class TreeSetDemo2 {
	public static void main(String[] args) {
		// TreeSet<Student> ts = new TreeSet<Student>();Ĭ��Ϊ��Ȼ����

		// �Ƚ�������
		// TreeSet<Student> ts = new TreeSet<Student>(new MyComparator());

		// �������ڲ���ʵ��
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
