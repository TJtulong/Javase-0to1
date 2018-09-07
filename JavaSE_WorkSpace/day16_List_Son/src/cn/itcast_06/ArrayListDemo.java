package cn.itcast_06;

import java.util.ArrayList;
import java.util.Iterator;

/*
 *	存储自定义对象并遍历
 */
public class ArrayListDemo {
	public static void main(String[] args) {
		//JDK7的新特性：泛型推断（不建议）
		ArrayList<Student> array = new ArrayList<Student>();
		
		array.add(new Student("王若潇",22));
		array.add(new Student("曹操",260));
		array.add(new Student("吕布",32));
		
		Iterator<Student> it=array.iterator();
		while(it.hasNext()) {
			Student s=it.next();
			System.out.println(s.getName()+"----"+s.getAge());
		}
	}
}
