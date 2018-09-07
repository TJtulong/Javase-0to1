package cn.itcast_01;

import java.util.Date;

/*
 *  Date()
 *  表示特定的瞬间，精确到毫秒
 *  构造方法：
 *  	Date():根据当前的默认毫秒值创建日期对象
 *  	Date(long date):根据给定的毫秒值创建日期对象
 *  	注意要考虑时差问题
 */
public class DateDemo {
	public static void main(String[] args) {
		Date d=new Date();
		System.out.println("d="+d);
		
		long time=System.currentTimeMillis();
		Date d2 = new Date(time);
		System.out.println("d2="+d);
	}
}
