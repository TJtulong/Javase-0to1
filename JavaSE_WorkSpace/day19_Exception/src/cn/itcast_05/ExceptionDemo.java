package cn.itcast_05;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * 有些时候，我们没有权限去处理某个异常
 * 为了解决出错问题，java提供了抛出的处理方案
 * 格式:
 * 		throws 异常类名
 * 		注意：这个格式必须跟在方法的括号后
 * 注意:尽量不要在main方法上抛出异常
 * 
 * 编译期异常抛出，调用者必须处理
 * 运行期异常，调用者可以不处理
 */
public class ExceptionDemo {
	public static void main(String[] args) {
		System.out.println("今天天气好");
		try {
			method();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("有雾霾");// 能够输出

		method2();
	}

	// 运行期异常的抛出
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
