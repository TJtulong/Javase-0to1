package cn.itcast_02;

/*
 * A.һ���쳣
 * B.�����쳣
 * 		1.ÿһ��дһ��try...catch()
 * 		2.дһ��try,���catch
 *		try{}
 *		catch(�쳣����,������){}
 *		catch(�쳣����,������){}
 *		......
 *		ע�⣺����ȷ�ľ�����ȷ����Ҫ��Ҫ�ô�Ĵ���Ч�ʵ�
 *		Exception��������ƽ����ϵ˳������ν�����������Ӻ���
 */
public class ExceptionDemo2 {
	public static void main(String[] args) {
		method1();
		method2();// ��������Ϊ0 over ֻ��һ���쳣
		method3();
	}

	public static void method1() {
		int a = 10;
		int b = 0;
		try {
			System.out.println(a / b);
		} catch (ArithmeticException e) {
			System.out.println("��������Ϊ0");
		}

		int[] arr = { 1, 2, 3 };
		try {
			System.out.println(arr[3]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("����Խ��");
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
			System.out.println("��������Ϊ0");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("����Խ��");
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
			System.out.println("������һ����������쳣");
		} catch (ArithmeticException e) {
			System.out.println("��������Ϊ0");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("����Խ��");
		} catch (Exception e) {
			System.out.println("��������");
		}
		System.out.println("over");
	}
}
