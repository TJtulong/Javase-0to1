package cn.itcast_04;

import java.text.ParseException;
import java.util.Date;

public class DateUtilDemo {
	public static void main(String[] args) throws ParseException {
		Date d=new Date();
		String s=DateUtil.dateToString(d, "yyyy-MM-dd HH:mm:ss");
		System.out.println(s);
		
		String str="2014-10-4";
		Date dd =DateUtil.StringToDate(str, "yyyy-MM-dd");
		System.out.println(dd);
	}
}
