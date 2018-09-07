package cn.itcast_04;
/*
 * String的转换功能
 * 		byte[] getBytes():把字符串转换为字节数组
 * 		char[] toCharArray():把字符串转换为字符数组
 * 		static String valueOf(char[] chs):把字符数组转成字符串
 * 		static String valueOf(int i):把int类型数据转成字符串
 * 			valueOf可以把任意类型的数据转换成字符串
 * 		String toLowerCase():把字符串转换成小写
 * 		String toUpperCase():把字符串转换成大写
 * 		String concat(String str):把字符串拼接
 */
public class StringDemo {
	public static void main(String[] args) {
		String s = "JavaSE";
		
		byte[] bys = s.getBytes();
		for(int x=0;x<bys.length;x++) {
			System.out.println(bys[x]);
		}
		System.out.println("-----------");
		
		char[] chs = s.toCharArray();
		for(int x=0;x<chs.length;x++) {
			System.out.println(chs[x]);
		}
		System.out.println("-----------");
		
		String ss=String.valueOf(chs);
		System.out.println(ss);
		System.out.println("-----------");
		
		int i =100;
		String sss= s.valueOf(i);
		System.out.println(sss);
		System.out.println("-----------");
		
		System.out.println(s.toLowerCase());
		System.out.println(s);//s本身不变
		System.out.println("-----------");
		
		System.out.println(s.toUpperCase());
		System.out.println("-----------");
		
		String s1="hello";
		String s2="world";
		String s4=s1.concat(s2);
		System.out.println(s4);
	}
}
