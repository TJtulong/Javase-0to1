package cn.itcast_06;

import java.util.Calendar;
import java.util.Scanner;

/*
 * 获取任意一年二月有多少天
 */
public class CalendarTest2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入年份");
		int year = sc.nextInt();

		Calendar c = Calendar.getInstance();
		c.set(year, 2, 1);
		c.add(Calendar.DATE, -1);
		System.out.println(c.get(Calendar.DATE));
	}
}
