package cn.itcast_01;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * 学生根据学号区分，通过学号获取学生姓名
 * Map集合的特点：可以存储键值对的元素
 * 		学号1---->姓名1
 * 键是唯一的，但多个键可以为同一个值
 * 		将建映射到值的对象，一个映射不能包含重复的键，每个键最多能映射到一个值
 * 
 * Map与Collection的区别：
 * 			Map集合存储元素是成对出现的；
 * 			Collection集合存储元素单独出现
 * 
 * 注意：Map集合的数据结构只针对键有效，与值无关
 * HashMap和TreeMap
 * 
 * Map集合的功能：
 * 		1.添加功能
 * 				V put(K key, V value):添加元素
 * 				如果键是第一次存储，就返回null
 * 				如果键不是第一次存在，就把值用新值覆盖，返回以前的值
 * 		2.删除功能
 * 				void clear():移除所有的键值对元素
 * 				V remove(Object key):根据键删除键值对元素，并返回值
 * 		3.判断功能
 * 				boolean containsKey(Object key)：判断集合是否包含指定键
 * 				boolean containsValue(Object value)：判断集合是否包含指定值
 * 				boolean isEmpty():判断集合是否为空
 * 		4.获取功能
 * 				Set<Map.Entry<K,V>> entrySet()
 * 				V get(Object key):根据键获取值
 * 				Set<K> KeySet():获取集合中所有键的集合
 * 				Collection<V> values(): 获取几何中所有值的集合
 * 		5.长度功能
 * 				int size():返回集合中的键值对数
 * 			
 */
public class MapDemo {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();

		// V put(K key, V value):添加元素
		// System.out.println("put="+map.put("文章","马伊琍"));//put=null
		// System.out.println("put="+map.put("文章","姚笛"));//put=马伊琍

		map.put("邓超", "孙俪");
		map.put("黄晓明", "Angelababy");
		map.put("周杰伦", "昆凌");
		map.put("刘恺威", "杨幂");

		// void clear()
		// map.clear();

		// V remove(Object key)
		System.out.println("remove=" + map.remove("黄晓明"));// remove=Angelababy
		System.out.println("remove=" + map.remove("黄晓"));// remove=null

		// boolean containsKey(Object key)
		System.out.println("contains=" + map.containsKey("黄晓明"));
		System.out.println("contains=" + map.containsKey("周杰伦"));

		// boolean isEmpty()
		System.out.println("isempty=" + map.isEmpty());// isempty=false

		// int size()
		System.out.println("size=" + map.size());// size=3

		// V get(Object key)
		System.out.println("get=" + map.get("周杰伦"));// get=昆凌

		// Set<K> KeySet()
		Set<String> set = map.keySet();
		for (String key : set) {
			System.out.println(key);
		}

		// Collection<V> values()
		Collection<String> col = map.values();
		for (String value : col) {
			System.out.println(value);
		}

		System.out.println("Map:" + map);// 无序
	}
}
