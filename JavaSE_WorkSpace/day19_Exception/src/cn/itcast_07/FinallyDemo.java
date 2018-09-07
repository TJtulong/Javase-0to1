package cn.itcast_07;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * finally:被fianlly控制的语句体一定会执行
 * 注意：如果在执行到finally之前jvm退出了，既不能执行了
 * 格式：
 * 		try...catch...finally
 * 作用：
 * 		用于释放资源，在IO流和数据库操作中经常遇到
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
			System.out.println("可执行的代码");
		}

		System.out.println(d);
	}
}
