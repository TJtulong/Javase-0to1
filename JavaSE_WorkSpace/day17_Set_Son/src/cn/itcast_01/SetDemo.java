package cn.itcast_01;

import java.util.HashSet;
import java.util.Set;

/*
 * Set:无序（存储顺序与取出顺序不唯一），唯一
 * HastSet:它不保证set的迭代顺序；特别是它不保证该顺序恒久不变
 * 			有自己的存储顺序
 */
public class SetDemo {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();

		set.add("hello");
		set.add("world");
		set.add("java");
		set.add("world");// 相同的不进去
		set.add("java");// 相同的不进去

		for (String s : set) {
			System.out.println(s);
		}
	}
}
