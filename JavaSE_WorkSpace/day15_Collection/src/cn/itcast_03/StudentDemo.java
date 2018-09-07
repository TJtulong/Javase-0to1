package cn.itcast_03;

import java.util.ArrayList;
import java.util.Collection;

import cn.itcast_01.Student;

public class StudentDemo {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		Student s1 = new Student("ÍõÈôäì",22);
		Student s2 = new Student("ÖÜ½ÜÂ×",40);
		Student s3 = new Student("ÕÔÀÚ",12);
		Student s4 = new Student("ËïÈ¨",62);
		Student s5 = new Student("CÂŞ",33);
		
		c.add(s1);
		c.add(s2);
		c.add(s3);
		c.add(s4);
		c.add(s5);
		
		Object[] objs = c.toArray();
		for(int x=0;x<objs.length;x++) {
			Student s = (Student)objs[x];
			System.out.println(s.getName()+"---"+s.getAge());
		}
	}
}
