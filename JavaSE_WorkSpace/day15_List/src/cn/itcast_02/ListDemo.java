package cn.itcast_02;

import java.util.ArrayList;
import java.util.List;

/*
 * List集合的特有功能
 * A.添加功能：
 * 		void add(int index,Object element):在指定位置添加元素
 * B.获取功能
 * 		Object obj get(int index):获取指定位置元素
 * C.列表迭代器
 * 		ListIterator listIterator():列表集合特有的迭代器
 * D.删除功能
 * 		Object remove(int index):根据索引删除元素
 * E.修改功能
 * 		Object set(int index,Object element):根据索引修改元素
 */
public class ListDemo {
	public static void main(String[] args) {
		List list = new ArrayList();

		list.add("hello");
		list.add("world");
		list.add("java");

		// void add(int index,Object element)
		list.add(1, "Android");// list=[hello, Android, world, java]

		// Object obj get(int index)
		System.out.println("get=" + list.get(1));

		// Object remove(int index)
		System.out.println("remove=" + list.remove(1));// remove=Android

		// Object set(int index,Object element)
		System.out.println("set=" + list.set(1, "javaee"));// set=world

		System.out.println("list=" + list);
	}
}
