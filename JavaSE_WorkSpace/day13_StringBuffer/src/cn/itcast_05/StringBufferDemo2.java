package cn.itcast_05;
/*
 * 	½ØÈ¡¹¦ÄÜ;
 * 		public String substring(int start)
 * 		public String substring(int start,int end)
 */
public class StringBufferDemo2 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append("hello").append("world").append("java");
		
		String s = sb.substring(5);
		System.out.println("s="+s);
		System.out.println("sb="+sb);
	}
}
