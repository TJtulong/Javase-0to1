package cn.itcast_03;

import java.util.LinkedList;

/*
 * LinkedList�����й���
 * 		A.��ӹ���
 * 			public void addFirst(Object e)
 * 			public void addLast(Object e)
 * 		B.��ȡ����
 * 			public Object getFirst()
 * 			public Object getLast()
 * 		D.ɾ������
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
		link.addLast("android");// ������----��addһ��
		System.out.println(link.getFirst());
		System.out.println(link.getLast());

		System.out.println(link.removeFirst());
		System.out.println(link.removeLast());// ɾ��������

		System.out.println("link:" + link);
	}
}
