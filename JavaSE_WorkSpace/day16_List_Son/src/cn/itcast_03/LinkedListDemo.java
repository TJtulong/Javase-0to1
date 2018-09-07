package cn.itcast_03;

import java.util.LinkedList;

/*
 * LinkedList的特有功能
 * 		A.添加功能
 * 			public void addFirst(Object e)
 * 			public void addLast(Object e)
 * 		B.获取功能
 * 			public Object getFirst()
 * 			public Object getLast()
 * 		D.删除功能
 * 			public Object removeFirst()
 * 			public Object removeLast()
 */
public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList link = new LinkedList();

		link.add("hello");
		link.add("world");
		link.add("java");

		link.addFirst("javaee");
		link.addLast("android");// 无意义----与add一样
		System.out.println(link.getFirst());
		System.out.println(link.getLast());

		System.out.println(link.removeFirst());
		System.out.println(link.removeLast());// 删除并返回

		System.out.println("link:" + link);
	}
}
