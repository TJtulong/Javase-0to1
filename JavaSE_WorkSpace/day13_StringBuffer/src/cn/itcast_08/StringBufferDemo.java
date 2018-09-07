package cn.itcast_08;

public class StringBufferDemo {
	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "world";
		System.out.println(s1 + "---" + s2);//hello---world
		change(s1, s2);
		//把String当作基本类型，因为它的参数传递特殊
		System.out.println(s1 + "---" + s2);//hello---world
		StringBuffer sb1 = new StringBuffer("hello");
		StringBuffer sb2 = new StringBuffer("world");
		System.out.println(sb1 + "---" + sb2);//hello---world
		change(sb1, sb2);
		System.out.println(sb1 + "---" + sb2);//hello---worldworld
	}

	public static void change(StringBuffer sb1, StringBuffer sb2) {
		sb1 = sb2;
		sb2.append(sb2);
	}

	public static void change(String s1, String s2) {
		s1 = s2;
		s2 = s1 + s2;
	}
}
