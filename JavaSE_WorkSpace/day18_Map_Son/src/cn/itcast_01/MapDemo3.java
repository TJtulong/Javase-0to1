package cn.itcast_01;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * Map集合的遍历
 * 思路：
 * 		1.获取所有键值对对象的集合
 * 		2.遍历键值对对象集合，得到一个键值对对象
 * 		3.根据键值对对象获取键和值
 * 
 * 获取键值对对象：
 * 		Set<Map.Entry<K,V>> entrySet()
 * 		Map.Entry<K,V>就是键值对对象
 * 		Entry:实体
 */
public class MapDemo3 {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();

		map.put("邓超", "孙俪");
		map.put("黄晓明", "Angelababy");
		map.put("周杰伦", "昆凌");
		map.put("刘恺威", "杨幂");

		Set<Map.Entry<String, String>> set = map.entrySet();
		for (Map.Entry<String, String> me : set) {
			// 根据键值获取键和值
			String key = me.getKey();
			String value = me.getValue();
			System.out.println(key + "----" + value);
		}
	}
}
