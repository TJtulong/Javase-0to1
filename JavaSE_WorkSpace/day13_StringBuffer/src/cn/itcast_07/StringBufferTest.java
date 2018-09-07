package cn.itcast_07;

//String和StringBuffer的相互转换
public class StringBufferTest {
	public static void main(String[] args) {
		String s = "hello";
		// 注意不能把字符串的值直接赋值给StringBuffer
		// StringBuffer sb="hello";
		// StringBuffer sb = s;

		// 转换方式1：构造方法
		StringBuffer sb = new StringBuffer(s);
		// 转换方式2：append
		StringBuffer sb2 = new StringBuffer();
		sb2.append(s);

		StringBuffer buffer = new StringBuffer("hello");
		// 方式1：构造方法
		String s1 = new String(buffer);
		// 方式2：toString()方法
		String s2 = buffer.toString();
	}
}
