package cn.itcast_01;

/*
 * ��5�Ľ׳�
 * 1.���ݹ�Ҫдһ������
 * 2.��������
 * 3.����
 */
public class DiGuiDemo {
	public static void main(String[] args) {
		int jc = 1;
		for (int x = 2; x <= 5; x++) {
			jc *= x;
		}
		System.out.println("5�Ľ׳�Ϊ" + jc);

		System.out.println("5�Ľ׳�Ϊ" + jieCheng(5));
	}

	public static int jieCheng(int n) {
		if (n == 1) {
			return 1;
		} else {
			return n * jieCheng(n - 1);
		}
	}
}
