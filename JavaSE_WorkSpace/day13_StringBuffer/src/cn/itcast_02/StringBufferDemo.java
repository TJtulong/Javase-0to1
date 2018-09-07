package cn.itcast_02;

/*
 * StringBuffer的添加功能
 * 		public StringBuffer append(String str)
 * 		可以把任意类型添加到字符串缓冲区中,并返回字符串缓冲区本身
 * 		public StringBuffer insert(int offset, String str)
 * 		在指定位置插入任意类型的数据
 */
public class StringBufferDemo {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		/*
		 * StringBuffer sb2=sb.append("hello"); System.out.println("sb="+sb);
		 * System.out.println("sb2="+sb2); System.out.println(sb==sb2);//true
		 */

		sb.append("hello");
		sb.append("sss");
		sb.append(3.55);
		// 链式编程
		sb.append("dd").append(3).append(444);
		System.out.println("sb=" + sb);
		
		sb.insert(5, "world");
		System.out.println("sb="+sb);
	}
}
