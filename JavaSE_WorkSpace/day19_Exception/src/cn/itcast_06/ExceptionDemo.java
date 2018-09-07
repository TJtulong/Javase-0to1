package cn.itcast_06;

/*
 * throw:如果出现了异常情况，我们可以把该异常抛出，这是抛出的应该是异常的对象
 */
public class ExceptionDemo {
	public static void main(String[] args) {
		method();
		try {
			method2();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void method() {
		int a = 10;
		int b = 0;
		if (b == 0) {
			throw new ArithmeticException();
		} else {
			System.out.println(a / b);
		}
	}

	public static void method2() throws Exception {
		int a = 10;
		int b = 0;
		if (b == 0) {
			throw new Exception();
		} else {
			System.out.println(a / b);
		}
	}
}
