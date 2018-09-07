package cn.itcast_07;

//把代码用功能实现
public class StringTest2 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3 };
		String result = arrToStr(arr);
		System.out.println(result);
	}

	public static String arrToStr(int[] arr) {
		String s = "";
		s += "[";
		for (int x = 0; x < arr.length; x++) {
			if (x == arr.length - 1) {
				s += arr[x] + "]";
			} else {
				s += arr[x] + ", ";
			}
		}
		return (s);
	}
}