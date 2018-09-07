package cn.itcast_04;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 这是日期和字符串相互转换的工具类
 * @author TJtulong
 *
 */
public class DateUtil {
	private DateUtil() {}
	/**
	 * 这个方法的作用是将日期转换为字符串
	 * @param d 日期
	 * @param format 转换格式
	 * @return 格式化后的字符串
	 */
	public static String dateToString(Date d,String format) {
		SimpleDateFormat sdf=new SimpleDateFormat(format);
		return sdf.format(d);
	}
	
	public static Date StringToDate(String s,String format) throws ParseException {
		return new SimpleDateFormat(format).parse(s);
	}
}
