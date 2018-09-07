package cn.itcast_02;

import java.util.Date;

/*
 * public long getTime();获取时间，以毫秒为单位
 * public long setTime():设置时间
 * 		从Date得到毫秒值：getTime()
 * 		把毫秒值转换为Date
 * 			构造方法
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
