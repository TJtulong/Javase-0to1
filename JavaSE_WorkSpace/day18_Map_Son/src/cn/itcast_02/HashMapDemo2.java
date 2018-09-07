package cn.itcast_02;

import java.util.HashMap;
import java.util.Set;

//HashMap<Integer,String>
public class HashMapDemo2 {
	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();

		hm.put(27, "内马尔");
		hm.put(22, "王若潇");
		hm.put(33, "C罗");
		hm.put(31, "梅西");

		// 下面的写法是八进制，不能出现超过8的数据
		// hm.put(003,"hello");
		// hm.put(008,"hello");

		Set<Integer> set = hm.keySet();
		for (Integer key : set) {
			String value = hm.get(key);
			System.out.println(key + "----" + value);
		}
	}
}
