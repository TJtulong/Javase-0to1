package cn.itcast_01;

import java.util.HashSet;

/*
 * ���󣺴����Զ�����󲢱���
 * �����������ĳ�Ա����ֵ����ͬ����Ϊͬһ��Ԫ��
 */
public class SetDemo2 {
	public static void main(String[] args) {
		HashSet<Student> hs = new HashSet<Student>();
		
		Student s1=new Student("������",22);
		Student s2=new Student("÷��",31);
		Student s3=new Student("Ī������",33);
		Student s4=new Student("Ī������",33);
		Student s5=new Student("Ī������",35);
		
		hs.add(s1);
		hs.add(s2);
		hs.add(s3);
		hs.add(s4);
		hs.add(s5);
		
		for (Student s:hs) {
			System.out.println(s.getName()+"----"+s.getAge());
		}
	}
}
