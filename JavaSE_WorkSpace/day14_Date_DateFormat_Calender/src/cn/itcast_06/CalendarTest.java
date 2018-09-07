package cn.itcast_06;

import java.util.Calendar;

/*
 * Calendar�෽��
 * 		public void add(int field,int amount):���ݸ����������ֶκͶ�Ӧʱ�䡣�Ե�ǰ��������
 * 		public final void set(int year,int month,int date):�趨��ǰ����ʱ��
 */
public class CalendarTest {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH);
		int date = c.get(Calendar.DATE);
		System.out.println(year + "-" + (month + 1) + "-" + date);
		
		//����ǰ�Ľ���
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
