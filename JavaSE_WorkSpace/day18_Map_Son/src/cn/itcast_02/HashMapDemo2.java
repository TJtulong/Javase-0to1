package cn.itcast_02;

import java.util.HashMap;
import java.util.Set;

//HashMap<Integer,String>
public class HashMapDemo2 {
	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();

		hm.put(27, "�����");
		hm.put(22, "������");
		hm.put(33, "C��");
		hm.put(31, "÷��");

		// �����д���ǰ˽��ƣ����ܳ��ֳ���8������
		// hm.put(003,"hello");
		// hm.put(008,"hello");

		Set<Integer> set = hm.keySet();
		for (Integer key : set) {
			String value = hm.get(key);
			System.out.println(key + "----" + value);
		}
	}
}
