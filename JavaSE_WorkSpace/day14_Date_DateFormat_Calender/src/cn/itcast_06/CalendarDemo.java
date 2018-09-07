package cn.itcast_06;

import java.util.Calendar;

/*
 * Calendar类：操作日历字段
 * 		public int get(int field):返回给定日历字段的值
 * 		日历类中的每个日历字段都是静态的成员变量，并且是int类型
 */
public class CalendarDemo {
	public static void main(String[] args) {
		Calendar rightNow = Calendar.getInstance();// 子类对象，多态

		int year = rightNow.get(Calendar.YEAR);
		int month = rightNow.get(Calendar.MONTH);
		int date = rightNow.get(Calendar.DATE);
		System.out.println(year + "-" + (month + 1) + "-" + date);
	}
}
