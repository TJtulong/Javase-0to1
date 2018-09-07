package cn.itcast_03;

//遍历字符串中的每一个字符
public class StringTest {
	public static void main(String[] args) {
		String s = "helloworld";
		for (int x = 0; x < s.length(); x++) {
			System.out.println(s.charAt(x));
		}
	}
}
