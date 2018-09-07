package cn.itcast_01;

/*
 * 	字符串：就是由多个字符组成的一串数据，也可以看作是一个字符数组
 * 	通过查看API可知：
 * 		1.字符串值"abc"可以看成是一个字符串对象
 * 		2.字符串是常量，一旦被赋值，就不能被改变
 * 	构造方法：
 * 		public String ():空构造
 * 		public String(byte[] bytes):把字节数组转换成字符串
 * 		public String(byte[] bytes,int index,int length):把字节数组一部分转换为字符串
 * 		public String(char[] value):把字节数组转换成字符串
 * 		public String(char[] value,int index,int length):把字节数组一部分转换为字符串
 * 		public String(String original):把字符串常量值转换为字符串
 * 	字符串的方法:
 * 		public int length()：返回此字符串的长度
 */
public class StringDemo {
	public static void main(String[] args) {
		// public String ()
		String s1 = new String();
		System.out.println("s1=" + s1);
		System.out.println("s1.length()=" + s1.length());
		System.out.println("--------------------");

		// public String(byte[] bytes)
		byte[] bys = { 97, 98, 99, 100, 101 };
		String s2 = new String(bys);
		System.out.println("s2=" + s2);
		System.out.println("s2.length()=" + s2.length());
		System.out.println("--------------------");
		
		//public String(byte[] bytes,int index,int length)
		String s3 = new String(bys,1,3);
		System.out.println("s3=" + s3);
		System.out.println("s3.length()=" + s3.length());
		System.out.println("--------------------");
		
		//public String(char[] value)
		char[] chs = {'a','b','c','王','若','潇'};
		String s4 = new String(chs);
		System.out.println("s4=" + s4);
		System.out.println("s4.length()=" + s4.length());
		System.out.println("--------------------");
		
		//public String(char[] value,int index,int length)
		String s5 = new String(chs,2,2);
		System.out.println("s5=" + s5);
		System.out.println("s5.length()=" + s5.length());
		System.out.println("--------------------");
		
		//public String(String original)
		String s6 = new String("abcdef");
		System.out.println("s6=" + s6);
		System.out.println("s6.length()=" + s6.length());
		System.out.println("--------------------");
		
		//字符串字面值"abcdef"也可以看成是字符串对象
		String s7 = "abcde";
		System.out.println("s7=" + s7);
		System.out.println("s7.length()=" + s7.length());
	}
}
