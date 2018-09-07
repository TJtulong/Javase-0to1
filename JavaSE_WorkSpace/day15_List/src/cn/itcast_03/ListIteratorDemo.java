package cn.itcast_03;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/*列表迭代器
	ListIterator listIterator()
	该迭代器继承自Iterator迭代器，由hasnext和next方法
	
	特有功能：Object previous():逆向遍历
	*/
public class ListIteratorDemo {
	public static void main(String[] args) {
		List list = new ArrayList();

		list.add("hello");
		list.add("world");
		list.add("java");

		ListIterator lit = list.listIterator();// 子类对象
		while (lit.hasNext()) {
			String s = (String) lit.next();
			System.out.println(s);
		}
		while (lit.hasPrevious()) {
			System.out.println(lit.previous());// 逆向打印
		}
	}
}
