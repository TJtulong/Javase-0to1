package cn.itcast_04;

/*
 * 替换功能：
 * 	public String replaceAll(String regex,String replacement)
 * 	replaceAll替换所有符合正则表达式的子字符串
 */
public class RegexDemo {
	public static void main(String[] args) {
		String s = "hello11531534941kh239943892java";

		// 去除所有数字
		String regex = "\\d";
		String ss = "*";
		String result = s.replaceAll(regex, ss);
		System.out.println(result);
	}
}
