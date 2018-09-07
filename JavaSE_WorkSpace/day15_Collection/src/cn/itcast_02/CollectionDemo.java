package cn.itcast_02;

import java.util.ArrayList;
import java.util.Collection;

/*
 * Collection �Ǽ��ϵĶ����ӿڣ���������ϵ���ظ���Ψһ��������������
 * 		���ܣ�
 * 		1.��� 	boolean add(Object o):���һ��Ԫ��
 * 				boolean addAll(Collection c):���һ������
 * 		2.ɾ��	void clear():�Ƴ�����Ԫ��
 * 				boolean remove(Object o):�Ƴ�һ��Ԫ��
 *				boolean remove(Collection c)���Ƴ�һ�����ϵ�Ԫ��
 * 		3.�ж�	boolean contains(Object o):�жϼ������Ƿ����ָ���ļ���Ԫ��
 * 				boolean contains(Collection c)
 * 				boolean isEmpty():�жϼ����Ƿ�Ϊ��
 * 		4.��ȡ	Iterator<E> iterator():�ص�
 * 		5.����	int size() :Ԫ�صĸ���
 * 		6.����	boolean retainAll(Collection c):�������϶��е�Ԫ��
 * 		7.�Ѽ���תΪ����	Object[] toArray()
 */
public class CollectionDemo {
	public static void main(String[] args) {
		//�������϶���
		Collection c =new ArrayList();
		
		//boolean add(Object o)
		//System.out.println("add:"+c.add("hello"));//��Զ��Ϊtrue
		c.add("hello");
		c.add("world");
		c.add("java");
		System.out.println("c="+c);
		
		//void clear()
		//c.clear();
		//System.out.println("c="+c);
		
		//boolean remove(Object o)
		System.out.println(c.remove("hello"));
		System.out.println(c.remove("javaee"));
		System.out.println("c="+c);
		c.add("hello");
		
		//boolean contains(Object o)
		System.out.println("contains="+c.contains("hello"));
		System.out.println("contains="+c.contains("android"));
		
		//boolean isEmpty()
		System.out.println("isempty="+c.isEmpty());
		
		//int size()
		System.out.println("size="+c.size());
	}
}
