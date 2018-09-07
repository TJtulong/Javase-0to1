package cn.itcast_01;

import java.util.ArrayList;
import java.util.Iterator;

//ArrayList储存数组并遍历，加入泛型，增强for
public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<String> array = new ArrayList<String>();
		array.add("hello");
		array.add("world");
		array.add("java");

		// 迭代器
		Iterator<String> it = array.iterator();
		while (it.hasNext()) {
			String s = it.next();
			System.out.println(s);
		}
		System.out.println("---------");

		// 普通for
		for (int x = 0; x < array.size(); x++) {
			String s = array.get(x);
			System.out.println(s);
		}
		System.out.println("---------");

		// 增强for(常用)
		for (String s : array) {
			System.out.println(s);
		}
	}
}
