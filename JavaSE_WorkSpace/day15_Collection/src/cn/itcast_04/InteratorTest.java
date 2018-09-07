package cn.itcast_04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import cn.itcast_01.Student;

/*
 *	 用迭代器遍历集合存储的学生对象
 *	不要多次使用it.next()方法
 */
public class InteratorTest {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		Student s1 = new Student("王若潇", 22);
		Student s2 = new Student("周杰伦", 40);
		Student s3 = new Student("赵磊", 12);
		Student s4 = new Student("孙权", 62);
		Student s5 = new Student("C罗", 33);

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

		// for循环改进
		for (Iterator it = c.iterator(); it.hasNext();) {
			Student s = (Student) it.next();
			System.out.println(s.getName() + "---" + s.getAge());
		}
	}
}
