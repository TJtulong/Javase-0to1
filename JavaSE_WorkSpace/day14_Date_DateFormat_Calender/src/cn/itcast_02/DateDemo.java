package cn.itcast_02;

import java.util.Date;

/*
 * public long getTime();��ȡʱ�䣬�Ժ���Ϊ��λ
 * public long setTime():����ʱ��
 * 		��Date�õ�����ֵ��getTime()
 * 		�Ѻ���ֵת��ΪDate
 * 			���췽��
 * 			setTime(long time)
 * 
 */
public class DateDemo {
	public static void main(String[] args) {
		Date d = new Date();
		long time = d.getTime();
		System.out.println(time);

		System.out.println("d=" + d);
		d.setTime(1000);
		System.out.println("d=" + d);
	}
}
