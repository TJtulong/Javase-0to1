package cn.itcast_02;
/*
 * JDK7�������µ��쳣��������
 * 		try{
 * 		}catch(�쳣��1|�쳣��2|�쳣��2 ... ����){
 * 			......
 * 		}
 * 		ȱ�㣺	1.����ʽ��һ�µ�
 * 				2.����쳣�������ƽ����ϵ
 */
public class ExceptionDemo3 {
	public static void main(String[] args) {
		method();
	}

	public static void method() {
		int a = 10;
		int b = 0;
		int[] arr = { 1, 2, 3 };
		try {
			System.out.println(a / b);
			System.out.println(arr[3]);
			
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.out.println("��������");
		} 
		System.out.println("over");
	}
}
