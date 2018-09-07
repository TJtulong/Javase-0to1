package cn.itcast_03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * ���ڲ�����
 * 		Date---String(��ʽ��)
 * 			public final String format(Date date)
 * 		String---Date(����)
 * 			public final Parse(String sourse)
 * 
 * DateFormat:���Խ������ں��ַ����ĸ�ʽ���ͽ������������ǳ����࣬����ʹ�þ�������SimpleDateFormat
 * SimpleDateFormat�Ĺ��췽��
 * 		SimpleDateFormat()
 * 		SimpleDateFormat(String pattern):������ģʽ
 * 			�꣺y
 * 			�£�M
 * 			�գ�d
 * 			ʱ��H
 * 			�֣�m
 * 			�룺s
 * 			2012��12��12�� 12��12��12
 * 
 */
public class DateFormatDemo {
	public static void main(String[] args) throws ParseException {
		//Date---String(��ʽ��)
		Date d = new Date();
		//Ĭ��ģʽ
		//SimpleDateFormat sdf = new SimpleDateFormat();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd�� HH:mm:ss");
		String s = sdf.format(d);
		System.out.println(s);
		
		//String---Date(����)
		String str="2008-08-08 12:12:12";
		//��ʽ����ƥ��
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date dd = sdf2.parse(str);
		System.out.println(dd);
	}
}
