package cn.itcast_01;

/*
 * 쳲���������
 * ������
 * 		1.����ʵ��
 * 		2.�����ı仯ʵ��
 * 		3.�ݹ�ʵ��
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
