package cn.itcast_03;

//统计一个字符串大写字符，小写字符，数字字符出现的次数
public class StringTest2 {
	public static void main(String[] args) {
		String s = "Hello123World";
		int bigCount = 0;
		int smallCount = 0;
		int numCount = 0;

		for (int x = 0; x < s.length(); x++) {
			char ch = s.charAt(x);
			if (ch >= 'a' && ch <= 'z') {
				smallCount++;
			} else if (ch >= 'A' && ch <= 'Z') {
				bigCount++;
			} else {
				numCount++;
			}
		}
		System.out.println("大写字母"+bigCount+"个");
		System.out.println("小写字母"+smallCount+"个");
		System.out.println("数字字符"+numCount+"个");
	}
}
