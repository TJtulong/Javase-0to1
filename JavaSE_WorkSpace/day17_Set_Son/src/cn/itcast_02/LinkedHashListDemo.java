package cn.itcast_02;

import java.util.LinkedHashSet;

/*
 * LinkedHashList:底层数据结构由哈希表和链表组成
 * 哈希表保证元素的一致性
 * 链表保证元素有序（储存和取出一致）
 */
public class LinkedHashListDemo {
	public static void main(String[] args) {
		LinkedHashSet<String> hs = new LinkedHashSet<String>();

		hs.add("hello");
		hs.add("world");
		hs.add("java");

		for (String s : hs) {
			System.out.println(s);// 输出结果有序
		}
	}
}
