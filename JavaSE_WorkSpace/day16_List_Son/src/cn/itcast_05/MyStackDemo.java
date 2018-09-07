package cn.itcast_05;

import java.util.Iterator;
import java.util.LinkedList;

/*
 * 	用LinkedList模拟栈数据结构的集合
 */
public class MyStackDemo {
	public static void main(String[] args) {
		MyStack ms = new MyStack();

		ms.add("hello");
		ms.add("world");
		ms.add("java");

		while (!ms.isEmpty()) {
			System.out.println(ms.get());
		}
	}
}
