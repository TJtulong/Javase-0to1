package cn.itcast_04;

import java.util.Arrays;
import java.util.List;

/*
 * public static <T> List<T> asList(T ... a):把数组转为集合
 * 	集合的长度不能改变，因为该集合的本质是数组
 */
public class ArraysDemo {
	public static void main(String[] args) {
		String[] strArray = { "hello", "world", "java" };

		// List<String> list=Arrays.asList(strArray);
		List<String> list = Arrays.asList("hello", "world", "java");
		// list.add("javaee");//UnsupportedOperationException
		// list.remove("java");//UnsupportedOperationException
		list.set(1, "welcome");
		for (String s : list) {
			System.out.println(s);
		}
	}
}
