package cn.itcast_01;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * Map集合的遍历
 * 		1.获取所有的键
 * 		2.遍历键的集合，获取每一个键
 * 		3.根据键去找值
 */
public class MapDemo2 {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();

		map.put("邓超", "孙俪");
		map.put("黄晓明", "Angelababy");
		map.put("周杰伦", "昆凌");
		map.put("刘恺威", "杨幂");

		// 遍历
		Set<String> set = map.keySet();
		for (String key : set) {
			String value = map.get(key);
			System.out.println(key + "---" + value);
		}
	}
}
