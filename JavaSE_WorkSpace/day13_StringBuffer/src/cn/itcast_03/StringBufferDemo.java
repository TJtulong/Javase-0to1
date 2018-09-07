package cn.itcast_03;

/*
 * StringBuffer的删除功能
 *		public StringBuffer deleteCharAt(int index)
 *		public StringBuffer delete(int start,int end)
 */
public class StringBufferDemo {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append("hello").append("world").append("java");
		System.out.println("sb=" + sb);

		sb.deleteCharAt(1);
		System.out.println("sb=" + sb);

		// 删除world
		sb.delete(5, 10);
		System.out.println("sb=" + sb);// 包左不包右
		// 清空字符串缓冲区
		sb.delete(0, sb.length());
		System.out.println("sb=" + sb);
	}
}
