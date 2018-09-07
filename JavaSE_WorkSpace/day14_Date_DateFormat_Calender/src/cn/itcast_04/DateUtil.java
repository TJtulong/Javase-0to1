package cn.itcast_04;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * �������ں��ַ����໥ת���Ĺ�����
 * @author TJtulong
 *
 */
public class DateUtil {
	private DateUtil() {}
	/**
	 * ��������������ǽ�����ת��Ϊ�ַ���
	 * @param d ����
	 * @param format ת����ʽ
	 * @return ��ʽ������ַ���
	 */
	public static String dateToString(Date d,String format) {
		SimpleDateFormat sdf=new SimpleDateFormat(format);
		return sdf.format(d);
	}
	
	public static Date StringToDate(String s,String format) throws ParseException {
		return new SimpleDateFormat(format).parse(s);
	}
}
