package cn.itcast_04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 * Iterator<E> iterator():�����������ϵ�ר�ñ�������
 * 		��ȡԪ�ز��ƶ�����һ��λ�ã�Object next()
 * 			NoSuchElementException û��Ԫ��
 * 		�ж��Ƿ�����һ��Ԫ��
 * 			boolean hasNext()
 */
public class IteratorDemo {
	public static void main(String[] args) {
		// �������϶���
		Collection c = new ArrayList();
		c.add("hello");
		c.add("world");
		c.add("java");

		// Iterator iterator()
		Iterator it = c.iterator();// ʵ�ʷ���ֵ�϶�Ϊ������󣬶�̬
//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.next());

		// ��׼����
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
