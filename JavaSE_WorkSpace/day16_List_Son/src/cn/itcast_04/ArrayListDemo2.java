package cn.itcast_04;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * ArrayList中去除集合中字符串的重复值
 * 	不创建新数组
 */
public class ArrayListDemo2 {
	public static void main(String[] args) {
		ArrayList array = new ArrayList();
		array.add("hello");
		array.add("world");
		array.add("java");
		array.add("hello");
		array.add("world");
		array.add("java");

		// 拿0索引依次与后面比较
		for (int x = 0; x < array.size() - 1; x++)
			for (int y = x + 1; y < array.size(); y++) {
				if (array.get(x).equals(array.get(y))) {
					array.remove(y);
					y--;
				}

			}
		Iterator it = array.iterator();
		while (it.hasNext()) {
			String s = (String) it.next();
			System.out.println(s);
		}
	}
}
