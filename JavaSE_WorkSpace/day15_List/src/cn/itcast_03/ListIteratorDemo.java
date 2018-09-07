package cn.itcast_03;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/*�б������
	ListIterator listIterator()
	�õ������̳���Iterator����������hasnext��next����
	
	���й��ܣ�Object previous():�������
	*/
public class ListIteratorDemo {
	public static void main(String[] args) {
		List list = new ArrayList();

		list.add("hello");
		list.add("world");
		list.add("java");

		ListIterator lit = list.listIterator();// �������
		while (lit.hasNext()) {
			String s = (String) lit.next();
			System.out.println(s);
		}
		while (lit.hasPrevious()) {
			System.out.println(lit.previous());// �����ӡ
		}
	}
}
