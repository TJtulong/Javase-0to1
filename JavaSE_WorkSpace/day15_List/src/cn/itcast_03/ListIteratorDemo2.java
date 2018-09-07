package cn.itcast_03;

/*
 * ConcurrentModificationException
 * 		��������⵽����Ĳ����޸ģ��������������޸�ʱ���׳����쳣
 * 		����ԭ�򣺵������������ڼ��ϴ��ڵģ����Ϸ����ı�󣬵�������֪������Ϊ�����޸��쳣
 * 		��ν����
 * 			1.����������Ԫ�أ��������޸�Ԫ��
 * 			2.���ϱ���Ԫ�أ������޸�Ԫ��
 */
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo2 {
	public static void main(String[] args) {
		List list = new ArrayList();

		list.add("hello");
		list.add("world");
		list.add("java");

		/*
		 * Iterator it = list.Iterator(); while (lit.hasNext()) { String s = (String)
		 * it.next(); if ("world".equals(s)) { list.add("javaee"); } }
		 */

		// ����������Ԫ�أ��������޸�Ԫ��
		// ��ӵ�ɾ��Ԫ��֮��
		// ʹ���ӽӿ�ListIterator
		ListIterator lit = list.listIterator();
		while (lit.hasNext()) {
			String s = (String) lit.next();
			if ("world".equals(s)) {
				lit.add("javaee");
			}
		}
		System.out.println("list=" + list);// list=[hello, world, javaee, java]

		// ���ϱ���Ԫ�أ������޸�Ԫ��
		// ��������
		for (int x = 0; x < list.size(); x++) {
			String s = (String) list.get(x);
			if ("world".equals(s)) {
				list.add("javaee");
			}
		}
		System.out.println("list=" + list);//list=[hello, world, javaee, java, javaee]
	}
}
