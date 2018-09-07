package cn.itcast_05;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

/*
 * 需求：
 * 		"aabbabcabcdabcde" 转换为 a(5)b(4)c(3)d(2)e(1)
 */
public class TreeMapDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个字符串");
		String line = sc.nextLine();

		TreeMap<Character, Integer> tm = new TreeMap<>();
		char[] chs = line.toCharArray();
		for (char ch : chs) {
			Integer i = tm.get(ch);
			if (i == null) {
				tm.put(ch, 1);
			} else {
				i++;
				tm.put(ch, i);
			}
		}

		StringBuilder sb = new StringBuilder();
		Set<Character> set = tm.keySet();
		for (Character key : set) {
			Integer value = tm.get(key);
			sb.append(key).append("(").append(value).append(")");
		}

		String result = sb.toString();
		System.out.println("result=" + result);
		// result=a(5)b(5)c(3)d(2)e(1)
	}
}
