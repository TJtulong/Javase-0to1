package cn.itcast_04;

import java.util.TreeSet;

/*
 * TreeSet�����Զ����������
 * 1.����ʲô˳�����򣺰��������С����
 * 2.ʲô��ͬһ��Ԫ�أ�����������ͬ
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
