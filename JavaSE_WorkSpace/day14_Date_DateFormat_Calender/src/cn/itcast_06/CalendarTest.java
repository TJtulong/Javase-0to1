package cn.itcast_06;

import java.util.Calendar;

/*
 * Calendar类方法
 * 		public void add(int field,int amount):根据给定的日历字段和对应时间。对当前日历操作
 * 		public final void set(int year,int month,int date):设定当前日历时间
 */
public class CalendarTest {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH);
		int date = c.get(Calendar.DATE);
		System.out.println(year + "-" + (month + 1) + "-" + date);
		
		//三年前的今天
		c.add(Calendar.YEAR,-3);
		year = c.get(Calendar.YEAR);
		month = c.get(Calendar.MONTH);
		date = c.get(Calendar.DATE);
		System.out.println(year + "-" + (month + 1) + "-" + date);
		
		c.set(2011,11,11);
		year = c.get(Calendar.YEAR);
		month = c.get(Calendar.MONTH);
		date = c.get(Calendar.DATE);
		System.out.println(year + "-" + (month + 1) + "-" + date);//2011-12-11
	}
}
