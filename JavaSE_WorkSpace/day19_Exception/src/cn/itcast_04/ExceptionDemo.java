package cn.itcast_04;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * ��try���淢�������jvm������һ���쳣����Ȼ�����������׳�����catch����������ƥ��
 * ����ö�����ĳ�����͵ģ��ͻ�ִ�и�catch����Ĵ�����Ϣ
 * �쳣�еķ�����
 * 		public String getMessage():�쳣����Ϣ�ַ���
 * 		public String toString():�����쳣�ļ���Ϣ����
 * 			�˶�������name��ȫ·������
 * 			": "ð�ź�һ���ո�
 * 			���ô˶���getLocalizedMessage()�����Ľ����getMessage()���ݣ�
 * 		printStackTrace():��ȡ�쳣�������쳣��Ϣ���Լ��쳣�����ڳ����е�λ�ã�����ֵvoid
 */
public class ExceptionDemo {
	public static void main(String[] args) {

		String s = "2018-07-19";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			Date d = sdf.parse(s);
			System.out.println(d);
		} catch (ParseException e) {
			// e.printStackTrace();

			// getMessage
			System.out.println(e.getMessage());// Unparseable date: "2018-07-19"

			// toString()
			System.out.println(e.toString());
			// java.text.ParseException: Unparseable date: "2018-07-19"
			
			e.printStackTrace();
		}
		System.out.println("over");//�������
	}
}
