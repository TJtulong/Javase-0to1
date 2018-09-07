package cn.itcast_03;

/*
 * String类的获取功能（public）：
 * 		int length():获取字符串的长度
 * 		char charAt(int index):获取指定索引处的字符
 * 		int indexOf(int ch):返回指定字符在次字符串中第一次出现处的索引
 * 			为什么是int：'a'和97都可以代表a
 * 		int indexOf(String str):返回指定字符在次字符串中第一次出现处的索引
 * 		char charAt(int index,int fromIndex):返回指定字符在次字符串中指定位置后第一次出现处的索引
 * 		char charAt(String str,int fromIndex)
 * 		String substring(int start):从指定位置截取字符串，默认到末尾
 * 		String substring(int start，int end)
 */
public class StringDemo {
	public static void main(String[] args) {
		String s = "helloworld";

		// int length()
		System.out.println("s.length:" + s.length());

		// char charAt(int index)
		System.out.println("charat:" + s.charAt(7));

		// int indexOf(int ch)
		System.out.println("indexof:" + s.indexOf('l'));

		// int indexOf(String str)
		System.out.println("indexof:" + s.indexOf("owo"));

		// char charAt(int index,int fromIndex)
		System.out.println("indexof:" + s.indexOf('l', 4));
		System.out.println("indexof:" + s.indexOf('l', 40));// -1

		// String substring(int start) 包含start这个索引
		System.out.println("substring:" + s.substring(5));// world

		// String substring(int start，int end)包左不包右
		System.out.println("substring:" + s.substring(3, 8));// lowor

	}

}
