package cn.itcast_02;

import java.util.Scanner;

/*
 * 	基本格式：
 *	public boolean hasNextXxx():判断是否为某种类型的元素
 *	public Xxx nextInt():获取该元素ss
 *	举例：
 *	public boolean hasNextInt()
 *	public int nextInt()
 *	注意：
 *	InputMismatchException 输入与所需不匹配
 */
public class ScannerDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		if (sc.hasNextInt()) {
			int x = sc.nextInt();
			System.out.println("x=" + x);
		} else {
			System.out.println("输入数据有误");
		}
	}
}
