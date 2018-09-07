package cn.itcast_01;

import java.util.ArrayList;
import java.util.Iterator;

//ArrayList�������鲢���������뷺�ͣ���ǿfor
public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<String> array = new ArrayList<String>();
		array.add("hello");
		array.add("world");
		array.add("java");

		// ������
		Iterator<String> it = array.iterator();
		while (it.hasNext()) {
			String s = it.next();
			System.out.println(s);
		}
		System.out.println("---------");

		// ��ͨfor
		for (int x = 0; x < array.size(); x++) {
			String s = array.get(x);
			System.out.println(s);
		}
		System.out.println("---------");

		// ��ǿfor(����)
		for (String s : array) {
			System.out.println(s);
		}
	}
}
