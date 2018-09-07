package cn.itcast_04;

import java.math.BigInteger;

/*
 *  BigInteger:可以让超过Integer范围内的数据进行运算
 *  BigInteger(String val)
 *  方法：
 *  	add
 *  	substract
 *  	multiply
 *  	divide
 *  	public BigInteger[] divideAndRemainder(BigInteger val):返回商和余数的数组
 */
public class BigIntegerDemo {
	public static void main(String[] args) {
		Integer i = new Integer("2147483647");
		System.out.println(i);

		BigInteger bi = new BigInteger("2147483648");
		System.out.println("bi=" + bi);

		// 方法练习
		BigInteger bi1 = new BigInteger("100");
		BigInteger bi2 = new BigInteger("50");
		System.out.println("add=" + bi1.add(bi2));
		System.out.println("subtract=" + bi1.subtract(bi2));
		System.out.println("muttiply=" + bi1.multiply(bi2));
		System.out.println("divide=" + bi1.divide(bi2));
		System.out.println(bi1.divideAndRemainder(bi2)[0]);

	}
}
