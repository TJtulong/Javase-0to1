package cn.itcast_06;

import java.util.Calendar;

/*
 * Calendar�ࣺ���������ֶ�
 * 		public int get(int field):���ظ��������ֶε�ֵ
 * 		�������е�ÿ�������ֶζ��Ǿ�̬�ĳ�Ա������������int����
 */
public class CalendarDemo {
	public static void main(String[] args) {
		Calendar rightNow = Calendar.getInstance();// ������󣬶�̬

		int year = rightNow.get(Calendar.YEAR);
		int month = rightNow.get(Calendar.MONTH);
		int date = rightNow.get(Calendar.DATE);
		System.out.println(year + "-" + (month + 1) + "-" + date);
	}
}
