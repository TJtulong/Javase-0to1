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
			 * return a执行到这一步时，这里不是return a，而是return 30，
			 * 这个返回路径就形成了，再继续执行finally的内容a=40，接着return 30
			 */
		} finally {
			a = 40;
			//return a;//如果这样就是40
		}
		return a;
	}
}
