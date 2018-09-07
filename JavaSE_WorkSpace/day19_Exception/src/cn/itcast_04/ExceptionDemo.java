package cn.itcast_04;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * 在try里面发生问题后，jvm会生成一个异常对象，然后把这个对象抛出，和catch里面的类进行匹配
 * 如果该对象是某个类型的，就会执行该catch里面的处理信息
 * 异常中的方法：
 * 		public String getMessage():异常的消息字符串
 * 		public String toString():返回异常的简单信息描述
 * 			此对象的类的name（全路径名）
 * 			": "冒号和一个空格
 * 			调用此对象getLocalizedMessage()方法的结果（getMessage()内容）
 * 		printStackTrace():获取异常类名和异常信息，以及异常出现在程序中的位置，返回值void
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
		System.out.println("over");//可以输出
	}
}
