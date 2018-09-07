package cn.itcast_03;

/*
 * ConcurrentModificationException
 * 		当方法检测到对象的并发修改，但不允许这种修改时，抛出次异常
 * 		产生原因：迭代器是依赖于集合存在的，集合发生改变后，迭代器不知道，成为并发修改异常
 * 		如何解决：
 * 			1.迭代器迭代元素，迭代器修改元素
 * 			2.集合遍历元素，集合修改元素
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

		// 迭代器迭代元素，迭代器修改元素
		// 添加到删除元素之后
		// 使用子接口ListIterator
		ListIterator lit = list.listIterator();
		while (lit.hasNext()) {
			String s = (String) lit.next();
			if ("world".equals(s)) {
				lit.add("javaee");
			}
		}
		System.out.println("list=" + list);// list=[hello, world, javaee, java]

		// 集合遍历元素，集合修改元素
		// 在最后添加
		for (int x = 0; x < list.size(); x++) {
			String s = (String) list.get(x);
			if ("world".equals(s)) {
				list.add("javaee");
			}
		}
		System.out.println("list=" + list);//list=[hello, world, javaee, java, javaee]
	}
}
