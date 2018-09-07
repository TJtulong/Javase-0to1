package cn.itcast_02;

/*
 * 	判断功能（非静态方法）
 * 	boolean equals(object obj):比较字符串的内容是否相同
 * 	boolean equalsIgnoreCase(String str)：比较字符串的内容是否相同，忽略大小写
 * 	boolean contains(String str):判断大字符串中是否包含小字符串
 * 	boolean startsWith(String str):判断字符串是否以str开头
 * 	boolean endsWith(String str):判断字符串是否以str结尾
 * 	boolean isEmpty():判断字符串内容是否为空
 */
public class StringDemo {
	public static void main(String[] args) {
		String s1 = "helloworld";
		String s2 = "helloworld";
		String s3 = "Helloworld";

		// boolean equals(object obj)
		System.out.println("equals:" + s1.equals(s2));
		System.out.println("equals:" + s1.equals(s3));
		System.out.println("-------------------");

		// boolean equalsIgnoreCase(String str)
		System.out.println("equals:" + s1.equalsIgnoreCase(s2));
		System.out.println("equals:" + s1.equalsIgnoreCase(s3));
		System.out.println("-------------------");

		// boolean contains(String str)
		System.out.println("equals:" + s1.contains("hello"));// true
		System.out.println("equals:" + s1.contains("hw"));// false
		System.out.println("-------------------");

		// boolean startsWith(String str)
		System.out.println("startwith:" + s1.startsWith("h"));
		System.out.println("startwith:" + s1.startsWith("hello"));
		System.out.println("-------------------");

		// boolean isEmpty()
		System.out.println("isempty:" + s1.isEmpty());
		String s4 = "";
		System.out.println("isempty:" + s4.isEmpty());

	}
}
