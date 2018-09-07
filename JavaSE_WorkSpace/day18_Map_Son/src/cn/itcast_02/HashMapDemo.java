package cn.itcast_02;

import java.util.HashMap;
import java.util.Set;

/*
 * HashMap:是基于哈希表的Map接口实现
 * 哈希表的作用是用来保证键的惟一性的
 */
public class HashMapDemo {
	public static void main(String[] args) {
		HashMap<String, String> hm = new HashMap<String, String>();

		String key1 = "it001";
		String value1 = "马云";
		hm.put(key1, value1);
		hm.put("it003", "马化腾");
		hm.put("it004", "乔布斯");
		hm.put("it005", "张朝阳");
		hm.put("it002", "裘伯君");
		hm.put("it001", "比尔盖茨");

		Set<String> set = hm.keySet();
		for (String key : set) {
			String value = hm.get(key);
			System.out.println(key + "-----" + value);
		}
	}
}
