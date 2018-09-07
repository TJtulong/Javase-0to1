package cn.itcast_02;

import java.util.Enumeration;
import java.util.Vector;

/*
 * Vector �����й���:
 * 	1.��ӹ���
 * 		public void addElement(Object obj) ---add
 * 	2.��ȡ����
 * 		public Object elementAt(int index) ---get
 * 		public Enumeration elements()//��ͬ�ڵ����� -----Iterator
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

		Enumeration en = v.elements();// ����ʵ����Ķ���
		while (en.hasMoreElements()) {
			String s = (String) en.nextElement();
			System.out.println(s);
		}

	}
}
