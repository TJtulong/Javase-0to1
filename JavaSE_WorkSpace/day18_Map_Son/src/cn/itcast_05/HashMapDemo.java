package cn.itcast_05;

import java.util.HashMap;
import java.util.Set;

/*
 * HashMapÇ¶Ì×HashMap
 */
public class HashMapDemo {
	public static void main(String[] args) {
		HashMap<String, HashMap<String, Integer>> czbkMap = new HashMap<>();

		HashMap<String, Integer> jcMap = new HashMap<>();
		jcMap.put("³ÂÓñÁú", 20);
		jcMap.put("¸ßÔ½", 22);
		czbkMap.put("jc", jcMap);

		HashMap<String, Integer> jyMap = new HashMap<>();
		jyMap.put("Àî½Ü", 21);
		jyMap.put("²ÜÊ¯ÀÚ", 26);
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
