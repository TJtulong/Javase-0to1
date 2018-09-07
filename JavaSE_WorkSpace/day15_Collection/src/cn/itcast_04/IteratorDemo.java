package cn.itcast_04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 * Iterator<E> iterator():迭代器，集合的专用遍历方法
 * 		获取元素并移动到下一个位置：Object next()
 * 			NoSuchElementException 没有元素
 * 		判断是否还有下一个元素
 * 			boolean hasNext()
 */
public class IteratorDemo {
	public static void main(String[] args) {
		// 创建集合对象
		Collection c = new ArrayList();
		c.add("hello");
		c.add("world");
		c.add("java");

		// Iterator iterator()
		Iterator it = c.iterator();// 实际返回值肯定为子类对象，多态
//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.next());

		// 标准代码
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
