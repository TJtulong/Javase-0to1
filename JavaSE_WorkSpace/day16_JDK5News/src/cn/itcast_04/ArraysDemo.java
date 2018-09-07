package cn.itcast_04;

import java.util.Arrays;
import java.util.List;

/*
 * public static <T> List<T> asList(T ... a):������תΪ����
 * 	���ϵĳ��Ȳ��ܸı䣬��Ϊ�ü��ϵı���������
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
