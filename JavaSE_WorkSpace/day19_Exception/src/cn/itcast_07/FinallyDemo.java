package cn.itcast_07;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * finally:��fianlly���Ƶ������һ����ִ��
 * ע�⣺�����ִ�е�finally֮ǰjvm�˳��ˣ��Ȳ���ִ����
 * ��ʽ��
 * 		try...catch...finally
 * ���ã�
 * 		�����ͷ���Դ����IO�������ݿ�����о�������
 */
public class FinallyDemo {
	public static void main(String[] args) {
		String s = "2018-07-19";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date d = null;
		try {
			d = sdf.parse(s);
		} catch (ParseException e) {
			e.printStackTrace();
		}finally {
			System.out.println("��ִ�еĴ���");
		}

		System.out.println(d);
	}
}
