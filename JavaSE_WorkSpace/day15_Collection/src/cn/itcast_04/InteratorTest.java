package cn.itcast_04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import cn.itcast_01.Student;

/*
 *	 �õ������������ϴ洢��ѧ������
 *	��Ҫ���ʹ��it.next()����
 */
public class InteratorTest {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		Student s1 = new Student("������", 22);
		Student s2 = new Student("�ܽ���", 40);
		Student s3 = new Student("����", 12);
		Student s4 = new Student("��Ȩ", 62);
		Student s5 = new Student("C��", 33);

		c.add(s1);
		c.add(s2);
		c.add(s3);
		c.add(s4);
		c.add(s5);

		// Iterator it = c.iterator();
		// while(it.hasNext()) {
		// Student s = (Student) it.next();
		// System.out.println(s.getName()+"---"+s.getAge());
		// }

		// forѭ���Ľ�
		for (Iterator it = c.iterator(); it.hasNext();) {
			Student s = (Student) it.next();
			System.out.println(s.getName() + "---" + s.getAge());
		}
	}
}
