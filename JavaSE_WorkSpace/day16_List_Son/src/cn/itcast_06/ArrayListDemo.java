package cn.itcast_06;

import java.util.ArrayList;
import java.util.Iterator;

/*
 *	�洢�Զ�����󲢱���
 */
public class ArrayListDemo {
	public static void main(String[] args) {
		//JDK7�������ԣ������ƶϣ������飩
		ArrayList<Student> array = new ArrayList<Student>();
		
		array.add(new Student("������",22));
		array.add(new Student("�ܲ�",260));
		array.add(new Student("����",32));
		
		Iterator<Student> it=array.iterator();
		while(it.hasNext()) {
			Student s=it.next();
			System.out.println(s.getName()+"----"+s.getAge());
		}
	}
}
