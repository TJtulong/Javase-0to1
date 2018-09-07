package cn.itcast_01;

/*
 * 斐波那契数列
 * 方法：
 * 		1.数组实现
 * 		2.变量的变化实现
 * 		3.递归实现
 */
public class DiGuiTest {
	public static void main(String[] args) {
		int[] arr = new int[20];
		arr[0] = 1;
		arr[1] = 1;
		for (int x = 2; x < arr.length; x++) {
			arr[x] = arr[x - 1] + arr[x - 2];
		}
		System.out.println(arr[19]);

		int a = 1;
		int b = 1;
		for (int x = 0; x < 18; x++) {
			int temp = a;
			a = b;
			b = temp + b;
		}
		System.out.println(b);

		System.out.println(fib(20));
	}

	public static int fib(int n) {
		if (n == 1 || n == 2) {
			return 1;
		} else {
			return fib(n - 1) + fib(n - 2);
		}
	}
}
