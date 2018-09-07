package cn.itcast_03;

import java.util.LinkedHashMap;
import java.util.Set;

/*
 * LinkedHashMap:是Map接口的哈希表和链表实现，具有可预知的迭代顺序
 * 有哈希表保证惟一性，由链表保证有序
 */
public class LinkedHashMapDemo {
	public static void main(String[] args) {
		LinkedHashMap<String, String> hm = new LinkedHashMap<>();

		hm.put("it003", "马化腾");
		hm.put("it004", "乔布斯");
		hm.put("it005", "张朝阳");
		hm.put("it002", "裘伯君");
		hm.put("it002", "比尔盖茨");

		Set<String> set = hm.keySet();
		for (String key : set) {
			String value = hm.get(key);
			System.out.println(key + "---" + value);// 有序
		}
	}
}
