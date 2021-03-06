package cn.itcast_03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * 日期操作：
 * 		Date---String(格式化)
 * 			public final String format(Date date)
 * 		String---Date(解析)
 * 			public final Parse(String sourse)
 * 
 * DateFormat:可以进行日期和字符串的格式化和解析，但由于是抽象类，所以使用具体子类SimpleDateFormat
 * SimpleDateFormat的构造方法
 * 		SimpleDateFormat()
 * 		SimpleDateFormat(String pattern):给定的模式
 * 			年：y
 * 			月：M
 * 			日：d
 * 			时：H
 * 			分：m
 * 			秒：s
 * 			2012年12月12日 12：12：12
 * 
 */
public class DateFormatDemo {
	public static void main(String[] args) throws ParseException {
		//Date---String(格式化)
		Date d = new Date();
		//默认模式
		//SimpleDateFormat sdf = new SimpleDateFormat();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
		String s = sdf.format(d);
		System.out.println(s);
		
		//String---Date(解析)
		String str="2008-08-08 12:12:12";
		//格式必须匹配
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date dd = sdf2.parse(str);
		System.out.println(dd);
	}
}
