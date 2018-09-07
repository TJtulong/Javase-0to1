package cn.itcast_04;
/*
 * StringBufferµÄÌæ»»¹¦ÄÜ
 * public StringBuffer replace(int start,int end,String str)
 */
public class StringBufferDemo {
	public static void main(String[] args) {
		StringBuffer sb =new StringBuffer();
		sb.append("hello").append("world").append("java");
		
		sb.replace(5, 10, "happy");
		System.out.println("sb="+sb);
	}
}
