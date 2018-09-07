package cn.itcast_04;
/*
 * float和double类型很容易丢失精度
 * 为了提高精度，计算浮点数，java提供了BigDecimal类
 * BigDecimal:不可变的、任意精度的有符号十进制数
 */
public class BigDecimalDemo {
	public static void main(String[] args) {
		System.out.println(0.09 + 0.01);// 0.09999999999999999
		System.out.println(1.0 - 0.32);// 0.6799999999999999
		System.out.println(1.015 * 100);// 101.49999999999999
		System.out.println(1.301 / 100);// 0.013009999999999999

		System.out.println(1 - 0.12);// 0.88
	}
}
