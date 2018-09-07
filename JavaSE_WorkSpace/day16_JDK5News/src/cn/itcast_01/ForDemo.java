package cn.itcast_01;

import java.util.ArrayList;
import java.util.List;

/*
 * JDK5的新特性：自动拆装箱、泛型、增强for、静态导入、可变参数、枚举
 * 	增强for是for循环的一种
 * 		for(元素数据类型 变量:数组或者Collection集合){}
 * 
 * 	好处：简化了数组和集合的遍历
 * 	弊端：增强for的目标不能为null
 * 			先进行不为null的判断
 * 	增强for的实质是代替迭代器的
 */
public class ForDemo {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		for (int x = 0; x < arr.length; x++) {
			System.out.println(arr[x]);
		}
		System.out.println("-----------");

		// 增强for
		for (int x : arr) {
			System.out.println(x);
		}
		System.out.println("-----------");

		ArrayList<String> array = new ArrayList<>();
		array.add("hello");
		array.add("world");
		array.add("java");

		for (String s : array) {
			System.out.println(s);
		}

		List<String> list = null;
		if (list != null) {
			for (String s : list) {
				System.out.println(s);
			} // NullPointerException
		}
	}
}
