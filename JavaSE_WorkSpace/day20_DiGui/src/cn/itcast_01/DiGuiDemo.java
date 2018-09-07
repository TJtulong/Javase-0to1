package cn.itcast_01;

/*
 * 求5的阶乘
 * 1.作递归要写一个方法
 * 2.出口条件
 * 3.规律
 */
public class DiGuiDemo {
	public static void main(String[] args) {
		int jc = 1;
		for (int x = 2; x <= 5; x++) {
			jc *= x;
		}
		System.out.println("5的阶乘为" + jc);

		System.out.println("5的阶乘为" + jieCheng(5));
	}

	public static int jieCheng(int n) {
		if (n == 1) {
			return 1;
		} else {
			return n * jieCheng(n - 1);
		}
	}
}
