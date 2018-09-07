package cn.itcast_03;

/*
 * 编译时异常与运行时异常的区别：
 * 编译期异常：Java程序必须显示处理，否则程序就会发生错误，无法通过编译
 * 运行期异常：无序显示处理，也可以和编译时异常一样处理
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
		// System.out.println(a/b);//运行期异常，通过增强逻辑修改

		String s = "2018-07-19";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date d = sdf.parse(s);
			System.out.println(d);
		} catch (ParseException e) {
			// e.printStackTrace();
			System.out.println("解析日期出错");
		}
	}
}
