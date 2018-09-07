package cn.itcast_03;

import java.util.Arrays;

/*
 * 	将字符串"91 27 46 38 50"转为数组
 */
public class RegexTest2 {
	public static void main(String[] args) {
		String s = "91 27 46 38 50";
		String[] strArray = s.split(" ");
		int[] arr = new int[strArray.length];
		for (int x = 0; x < strArray.length; x++) {
			arr[x] = Integer.parseInt(strArray[x]);
		}
		Arrays.sort(arr);
		StringBuffer sb = new StringBuffer();
		for (int x = 0; x < arr.length; x++) {
			sb.append(arr[x]).append(" ");
		}
		String result = sb.toString().trim();
		System.out.println(result);
	}
}
