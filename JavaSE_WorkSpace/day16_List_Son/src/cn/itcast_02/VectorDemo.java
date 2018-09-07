package cn.itcast_02;

import java.util.Enumeration;
import java.util.Vector;

/*
 * Vector 的特有功能:
 * 	1.添加功能
 * 		public void addElement(Object obj) ---add
 * 	2.获取功能
 * 		public Object elementAt(int index) ---get
 * 		public Enumeration elements()//等同于迭代器 -----Iterator
 */
public class VectorDemo {
	public static void main(String[] args) {
		Vector v = new Vector();

		v.addElement("Hello");
		v.addElement("world");
		v.addElement("java");

		for (int x = 0; x < v.size(); x++) {
			String s = (String) v.elementAt(x);
			System.out.println(s);
		}
		System.out.println("------------");

		Enumeration en = v.elements();// 返回实现类的对象
		while (en.hasMoreElements()) {
			String s = (String) en.nextElement();
			System.out.println(s);
		}

	}
}
