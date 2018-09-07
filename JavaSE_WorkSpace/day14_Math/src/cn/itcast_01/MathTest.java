package cn.itcast_01;

import java.util.Scanner;

/*
 * 设计一个方法：可以实现获取任意范围内的随机数
 */
public class MathTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入开始数");
		int start = sc.nextInt();
		System.out.println("请输入结束数");
		int end = sc.nextInt();
		int num = getRandom(start, end);
		System.out.println(num);
	}

	public static int getRandom(int start, int end) {
		int number = (int) (Math.random() * (end - start + 1)) + start;
		return number;
	}
}
