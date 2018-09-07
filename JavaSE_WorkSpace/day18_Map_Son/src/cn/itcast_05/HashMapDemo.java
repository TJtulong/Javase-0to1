package cn.itcast_05;

import java.util.HashMap;
import java.util.Set;

/*
 * HashMapǶ��HashMap
 */
public class HashMapDemo {
	public static void main(String[] args) {
		HashMap<String, HashMap<String, Integer>> czbkMap = new HashMap<>();

		HashMap<String, Integer> jcMap = new HashMap<>();
		jcMap.put("������", 20);
		jcMap.put("��Խ", 22);
		czbkMap.put("jc", jcMap);

		HashMap<String, Integer> jyMap = new HashMap<>();
		jyMap.put("���", 21);
		jyMap.put("��ʯ��", 26);
		czbkMap.put("jy", jyMap);

		Set<String> czbkMapSet = czbkMap.keySet();
		for (String key : czbkMapSet) {
			System.out.println(key);
			HashMap<String, Integer> czbkMapValue = czbkMap.get(key);
			Set<String> czbkMapValueSet = czbkMapValue.keySet();
			for (String czbkMapValueKey : czbkMapValueSet) {
				Integer czbkMapValueValue = czbkMapValue.get(czbkMapValueKey);
				System.out.println(czbkMapValueKey + "----" + czbkMapValueValue);
			}
		}
	}
}
