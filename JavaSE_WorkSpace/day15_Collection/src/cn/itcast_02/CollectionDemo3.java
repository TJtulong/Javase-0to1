package cn.itcast_02;

import java.util.ArrayList;
import java.util.Collection;

/*
 * 	��������
 * 		Object[] toArray()
 */
public class CollectionDemo3 {
	public static void main(String[] args) {
		// �������϶���
		Collection c = new ArrayList();
		c.add("hello");
		c.add("world");
		c.add("java");

		// ����
		// Object[] toArray() �Ѽ��ϱ�Ϊ���飬����ʵ�ּ��ϱ���
		Object[] objs = c.toArray();
		for (int x = 0; x < objs.length; x++) {
			System.out.println(objs[x]);
			// System.out.println(objs[x].length());
			// object��û��length()������Ҫ��Ԫ�ػ�ԭΪ�ַ���
			// ����ת��
			String s = (String) objs[x];
			System.out.println(s.length());

		}
	}
}
