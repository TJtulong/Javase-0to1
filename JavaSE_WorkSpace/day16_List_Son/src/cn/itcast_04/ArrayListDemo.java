package cn.itcast_04;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * ArrayList��ȥ���������ַ������ظ�ֵ
 */
public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList array = new ArrayList();
		array.add("hello");
		array.add("world");
		array.add("java");
		array.add("hello");
		array.add("world");
		array.add("java");
		
		//�����¼���
		ArrayList newArray =new ArrayList();
		
		//�����ɼ��ϣ���ȡÿһ��Ԫ��
		Iterator it = array.iterator();
		while(it.hasNext()) {
			String s = (String)it.next();
			
			if(!newArray.contains(s)) {
				newArray.add(s);
			}
		}
		
		for(int x=0;x<newArray.size();x++) {
			String s = (String)newArray.get(x);
			System.out.println(s);
		}
	}
}
