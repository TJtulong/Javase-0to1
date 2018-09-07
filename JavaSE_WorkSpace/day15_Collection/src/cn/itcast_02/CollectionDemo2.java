package cn.itcast_02;

import java.util.ArrayList;
import java.util.Collection;

/*
 *boolean addAll(Collection c):���һ������
 *boolean removeAll(Collection c)���Ƴ�һ�����ϵ�Ԫ��
 *boolean containsAll(Collection c)
 *boolean retainAll(Collection c):�������϶��е�Ԫ��
 */
public class CollectionDemo2 {
	public static void main(String[] args) {
		// ��������1
		Collection c1 = new ArrayList();
		c1.add("abc1");
		c1.add("abc2");
		c1.add("abc3");
		c1.add("abc4");

		// ��������2
		Collection c2 = new ArrayList();
		c2.add("abc4");
		c2.add("abc5");
		c2.add("abc6");
		c2.add("abc7");

		// boolean addAll(Collection c):�������ظ�
		// c1.addAll(c2);

		// boolean removeAll(Collection c):�Ƴ�����Ԫ��
		System.out.println(c1.removeAll(c2)); // c1=[abc1, abc2, abc3]
		c1.add("abc4");

		// boolean containsAll(Collection c):ֻ�а������е�Ԫ�زŷ���true
		System.out.println("containsAll=" + c1.contains(c2));// false

		// boolean retainAll(Collection c)���ѹ��еĸ���c1
		System.out.println("retainAll=" + c1.retainAll(c2));// c1=[abc4]

		System.out.println("c1=" + c1);
		System.out.println("c2=" + c2);
	}
}
