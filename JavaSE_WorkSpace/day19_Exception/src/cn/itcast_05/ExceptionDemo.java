package cn.itcast_05;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * ��Щʱ������û��Ȩ��ȥ����ĳ���쳣
 * Ϊ�˽���������⣬java�ṩ���׳��Ĵ�����
 * ��ʽ:
 * 		throws �쳣����
 * 		ע�⣺�����ʽ������ڷ��������ź�
 * ע��:������Ҫ��main�������׳��쳣
 * 
 * �������쳣�׳��������߱��봦��
 * �������쳣�������߿��Բ�����
 */
public class ExceptionDemo {
	public static void main(String[] args) {
		System.out.println("����������");
		try {
			method();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("������");// �ܹ����

		method2();
	}

	// �������쳣���׳�
	public static void method2() throws ArithmeticException {
		int a = 10;
		int b = 0;
		System.out.println(a / b);
	}

	public static void method() throws ParseException {
		String s = "2018-07-19";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date d = sdf.parse(s);
		System.out.println(d);
	}

}
