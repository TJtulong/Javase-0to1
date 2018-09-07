package cn.itcast_02;

/*
 * A.一个异常
 * B.两个异常
 * 		1.每一个写一个try...catch()
 * 		2.写一个try,多个catch
 *		try{}
 *		catch(异常类名,变量名){}
 *		catch(异常类名,变量名){}
 *		......
 *		注意：能明确的尽量明确，不要不要用大的处理，效率低
 *		Exception必须放最后，平级关系顺序无所谓，父必须在子后面
 */
public class ExceptionDemo2 {
	public static void main(String[] args) {
		method1();
		method2();// 除数不能为0 over 只走一个异常
		method3();
	}

	public static void method1() {
		int a = 10;
		int b = 0;
		try {
			System.out.println(a / b);
		} catch (ArithmeticException e) {
			System.out.println("除数不能为0");
		}

		int[] arr = { 1, 2, 3 };
		try {
			System.out.println(arr[3]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("索引越界");
		}
		System.out.println("over");
	}

	public static void method2() {
		int a = 10;
		int b = 0;
		int[] arr = { 1, 2, 3 };
		try {
			System.out.println(a / b);
			System.out.println(arr[3]);
		} catch (ArithmeticException e) {
			System.out.println("除数不能为0");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("索引越界");
		}
		System.out.println("over");
	}

	public static void method3() {
		int a = 10;
		int b = 0;
		int[] arr = { 1, 2, 3 };
		try {
			System.out.println(a / b);
			System.out.println(arr[3]);
			System.out.println("出现了一个不清楚的异常");
		} catch (ArithmeticException e) {
			System.out.println("除数不能为0");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("索引越界");
		} catch (Exception e) {
			System.out.println("出问题了");
		}
		System.out.println("over");
	}
}
