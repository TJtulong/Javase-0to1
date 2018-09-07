package cn.itcast_02;

import java.util.ArrayList;
import java.util.Collection;

/*
 *boolean addAll(Collection c):添加一个集合
 *boolean removeAll(Collection c)：移除一个集合的元素
 *boolean containsAll(Collection c)
 *boolean retainAll(Collection c):两个集合都有的元素
 */
public class CollectionDemo2 {
	public static void main(String[] args) {
		// 创建集合1
		Collection c1 = new ArrayList();
		c1.add("abc1");
		c1.add("abc2");
		c1.add("abc3");
		c1.add("abc4");

		// 创建集合2
		Collection c2 = new ArrayList();
		c2.add("abc4");
		c2.add("abc5");
		c2.add("abc6");
		c2.add("abc7");

		// boolean addAll(Collection c):可以有重复
		// c1.addAll(c2);

		// boolean removeAll(Collection c):移除共有元素
		System.out.println(c1.removeAll(c2)); // c1=[abc1, abc2, abc3]
		c1.add("abc4");

		// boolean containsAll(Collection c):只有包含所有的元素才返回true
		System.out.println("containsAll=" + c1.contains(c2));// false

		// boolean retainAll(Collection c)：把共有的付给c1
		System.out.println("retainAll=" + c1.retainAll(c2));// c1=[abc4]

		System.out.println("c1=" + c1);
		System.out.println("c2=" + c2);
	}
}
