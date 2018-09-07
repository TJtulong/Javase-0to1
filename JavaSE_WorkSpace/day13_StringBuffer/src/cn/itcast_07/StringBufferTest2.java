package cn.itcast_07;

public class StringBufferTest2 {
	public static void main(String[] args) {
		int[] arr = { 11, 22, 3, 4, 45, 44 };
		String s = arrayToString(arr);
		System.out.println(s);
	}

	public static String arrayToString(int[] arr) {
		StringBuffer sb = new StringBuffer();
		sb.append("[");
		for (int x = 0; x < arr.length; x++) {
			if (x == arr.length - 1) {
				sb.append(arr[x]);
			} else {
				sb.append(arr[x]).append(", ");
			}
		}
		sb.append("]");
		String s = new String(sb);
		return s;
	}
}
