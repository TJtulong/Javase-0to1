package cn.itcast_09;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * 异常注意事项;
 * 		A.子类重写父类方法时，子类的方法必须抛出相同的异常或父类异常的子类
 * 		B.如果父类抛出多个异常，子类重写父类时，
 * 		只能抛出相同的异常或其子类，子类不能抛出父类没有的异常
 * 		C.如果被重写的方法没有异常抛出，子类绝不肯抛出异常，
 * 		如果子类有异常，只能用try，不能用throws
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
	// public void show() throws Exception{ //不能是父类
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
		} // 不能抛出异常（父类没抛）
		System.out.println(d);
	}
}