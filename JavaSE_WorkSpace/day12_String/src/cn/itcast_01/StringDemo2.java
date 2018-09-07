package cn.itcast_01;

public class StringDemo2 {
	public static void main(String[] args) {
		String s1 = new String("hello");
		String s2 = "hello";

		System.out.println(s1 == s2); // false
		System.out.println(s1.equals(s2)); // true
	}
}
