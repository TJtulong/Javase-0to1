package cn.itcast_05;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * 获取功能
 * 		Patter和Matcher类的使用
 */
public class RegexDemo {
	public static void main(String[] args) {
		//模式和匹配器的典型调用顺序
		//把正则表达式编译成模式对象
		Pattern p=Pattern.compile("a*b");
		//通过模式对象得到匹配器对象，这个时候需要被匹配的字符串
		Matcher m =p.matcher("aaaaab");
		//调用匹配器对象功能
		boolean b=m.matches();
		System.out.println(b);
	}
}
