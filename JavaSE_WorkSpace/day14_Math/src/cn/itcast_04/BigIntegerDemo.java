package cn.itcast_04;

import java.math.BigInteger;

/*
 *  BigInteger:�����ó���Integer��Χ�ڵ����ݽ�������
 *  BigInteger(String val)
 *  ������
 *  	add
 *  	substract
 *  	multiply
 *  	divide
 *  	public BigInteger[] divideAndRemainder(BigInteger val):�����̺�����������
 */
public class BigIntegerDemo {
	public static void main(String[] args) {
		Integer i = new Integer("2147483647");
		System.out.println(i);

		BigInteger bi = new BigInteger("2147483648");
		System.out.println("bi=" + bi);

		// ������ϰ
		BigInteger bi1 = new BigInteger("100");
		BigInteger bi2 = new BigInteger("50");
		System.out.println("add=" + bi1.add(bi2));
		System.out.println("subtract=" + bi1.subtract(bi2));
		System.out.println("muttiply=" + bi1.multiply(bi2));
		System.out.println("divide=" + bi1.divide(bi2));
		System.out.println(bi1.divideAndRemainder(bi2)[0]);

	}
}
