package cn.itcast_01;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * 	ʹ��List�ĸ��������������
 * ArrayList
 */
public class ArrayListDemo {
	public static void main(String[] args) {
		//�������϶���
		ArrayList array = new ArrayList();
		
		//���Ԫ��
		array.add("hello");
		array.add("world");
		array.add("java");
		
		//����
		Iterator it = array.iterator();
		while(it.hasNext()) {
			String s =(String)it.next();
			System.out.println(s);
		}
		System.out.println("-----------");
		
		for(int x=0;x<array.size();x++) {
			String s =(String)array.get(x);
			System.out.println(s);
		}
		
	}
}
