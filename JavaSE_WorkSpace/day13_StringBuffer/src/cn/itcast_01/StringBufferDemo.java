package cn.itcast_01;

/*
 * 	线程安全（多线程）
 * 	安全--同步--数据是安全的
 * 	不安全--不同步--效率高一些
 * 	安全和效率问题
 * 
 * 	StringBuffer的构造方法:
 * 		public StringBuffer():无参构造
 * 		public StringBuffer(int capacity):指定容量的字符串缓冲对象
 * 		public StringBuffer(String str):指定内容的字符串缓冲对象
 * 
 * 	StringBuffer的方法:
 * 		public int capacity()：返回当前容量/理论值
 * 		public int length()：返回长度/实际值
 */
public class StringBufferDemo {
	public static void main(String[] args) {
		// public StringBuffer() 较为常用
		StringBuffer sb = new StringBuffer();
		System.out.println("sb=" + sb);
		System.out.println(sb.capacity());// 默认为16个字符
		System.out.println(sb.length());
		System.out.println("---------------");

		// public StringBuffer(int capacity)
		StringBuffer sb2 = new StringBuffer(50);
		System.out.println("sb=" + sb2);
		System.out.println(sb2.capacity());
		System.out.println(sb2.length());
		System.out.println("---------------");

		// public StringBuffer(String str)
		StringBuffer sb3 = new StringBuffer("hello");
		System.out.println("sb=" + sb3);
		System.out.println(sb3.capacity());
		System.out.println(sb3.length());
		System.out.println("---------------");
	}
}
