package cn.itcast_07;

public class FinallyDemo2 {
	public static void main(String[] args) {
		System.out.println(getInt());
	}

	public static int getInt() {
		int a = 0;
		try {
			System.out.println(a / 0);
			a = 20;
		} catch (ArithmeticException e) {
			a = 30;
			return a;
			/*
			 * return aִ�е���һ��ʱ�����ﲻ��return a������return 30��
			 * �������·�����γ��ˣ��ټ���ִ��finally������a=40������return 30
			 */
		} finally {
			a = 40;
			//return a;//�����������40
		}
		return a;
	}
}
