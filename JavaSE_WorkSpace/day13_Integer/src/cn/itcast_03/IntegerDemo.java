package cn.itcast_03;

/*
 * 十进制转换为其它进制
 * public static String toString(int i,int radix)
 * 其它进制到十进制
 * public static int parseInt(String s,int radix)
 */
public class IntegerDemo {
	public static void main(String[] args) {
		System.out.println(Integer.toString(100, 5));// 五进制
		System.out.println(Integer.toString(100, 7));// 七进制
		System.out.println(Integer.toString(100, -7));// 进制不能为负
		// 进制的范围-->2~36 0-9+a-z共36个

		// 其它进制到十进制
		System.out.println(Integer.parseInt("100", 10));
		System.out.println(Integer.parseInt("100", 2));
		System.out.println(Integer.parseInt("100", 8));
	}
}
