package cn.itcast_02;

import java.util.ArrayList;
import java.util.Collection;

/*
 * 	遍历数组
 * 		Object[] toArray()
 */
public class CollectionDemo3 {
	public static void main(String[] args) {
		// 创建集合对象
		Collection c = new ArrayList();
		c.add("hello");
		c.add("world");
		c.add("java");

		// 遍历
		// Object[] toArray() 把集合变为数组，可以实现集合遍历
		Object[] objs = c.toArray();
		for (int x = 0; x < objs.length; x++) {
			System.out.println(objs[x]);
			// System.out.println(objs[x].length());
			// object中没有length()方法，要把元素还原为字符串
			// 向下转型
			String s = (String) objs[x];
			System.out.println(s.length());

		}
	}
}
