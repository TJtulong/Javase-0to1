package cn.itcast_09;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * �쳣ע������;
 * 		A.������д���෽��ʱ������ķ��������׳���ͬ���쳣�����쳣������
 * 		B.��������׳�����쳣��������д����ʱ��
 * 		ֻ���׳���ͬ���쳣�������࣬���಻���׳�����û�е��쳣
 * 		C.�������д�ķ���û���쳣�׳�������������׳��쳣��
 * 		����������쳣��ֻ����try��������throws
 */
public class ExceptionDemo {

}

class Fu {
	public void show() throws ArithmeticException {

	}

	public void methow() {
	}
}

class Zi extends Fu {
	// public void show() throws Exception{ //�����Ǹ���
	public void show() throws ArithmeticException {

	}

	public void methow() {
		String s = "2018-07-11";
		SimpleDateFormat sdf = new SimpleDateFormat();
		Date d = null;
		try {
			d = sdf.parse(s);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // �����׳��쳣������û�ף�
		System.out.println(d);
	}
}