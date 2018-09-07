package cn.itcast_04;

import java.util.Set;
import java.util.TreeMap;

/*
 * TreeMap:是基于红黑树的Map接口实现
 */
public class TreeMapDemo {
	public static void main(String[] args) {
		TreeMap<String, String> tm = new TreeMap<String, String>();

		tm.put("it003", "马化腾");
		tm.put("it004", "乔布斯");
		tm.put("it005", "张朝阳");
		tm.put("it002", "裘伯君");
		tm.put("it002", "比尔盖茨");

		Set<String> set = tm.keySet();
		for (String key : set) {
			String value = tm.get(key);
			System.out.println(key + "----" + value);// 自然排序
		}
	}
}
