package cn.itcast_03;

/*
 * ����ʱ�쳣������ʱ�쳣������
 * �������쳣��Java���������ʾ�����������ͻᷢ�������޷�ͨ������
 * �������쳣��������ʾ����Ҳ���Ժͱ���ʱ�쳣һ������
 */
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * 
 */
public class ExceptionDemo {
	public static void main(String[] args) {
		int a = 0;
		int b = 0;
		// System.out.println(a/b);//�������쳣��ͨ����ǿ�߼��޸�

		String s = "2018-07-19";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date d = sdf.parse(s);
			System.out.println(d);
		} catch (ParseException e) {
			// e.printStackTrace();
			System.out.println("�������ڳ���");
		}
	}
}
