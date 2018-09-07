package cn.itcast_02;

import java.util.ArrayList;
import java.util.List;

/*
 * List���ϵ����й���
 * A.��ӹ��ܣ�
 * 		void add(int index,Object element):��ָ��λ�����Ԫ��
 * B.��ȡ����
 * 		Object obj get(int index):��ȡָ��λ��Ԫ��
 * C.�б������
 * 		ListIterator listIterator():�б������еĵ�����
 * D.ɾ������
 * 		Object remove(int index):��������ɾ��Ԫ��
 * E.�޸Ĺ���
 * 		Object set(int index,Object element):���������޸�Ԫ��
 */
public class ListDemo {
	public static void main(String[] args) {
		List list = new ArrayList();

		list.add("hello");
		list.add("world");
		list.add("java");

		// void add(int index,Object element)
		list.add(1, "Android");// list=[hello, Android, world, java]

		// Object obj get(int index)
		System.out.println("get=" + list.get(1));

		// Object remove(int index)
		System.out.println("remove=" + list.remove(1));// remove=Android

		// Object set(int index,Object element)
		System.out.println("set=" + list.set(1, "javaee"));// set=world

		System.out.println("list=" + list);
	}
}
