package cn.itcast_01;

import java.util.Date;

/*
 *  Date()
 *  ��ʾ�ض���˲�䣬��ȷ������
 *  ���췽����
 *  	Date():���ݵ�ǰ��Ĭ�Ϻ���ֵ�������ڶ���
 *  	Date(long date):���ݸ����ĺ���ֵ�������ڶ���
 *  	ע��Ҫ����ʱ������
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
