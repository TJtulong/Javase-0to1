package cn.itcast_05;

//反转功能
public class StringBufferDemo {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append("王若潇");

		sb.reverse();
		System.out.println(sb);
	}
}
