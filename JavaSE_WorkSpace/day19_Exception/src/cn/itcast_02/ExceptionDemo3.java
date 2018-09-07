package cn.itcast_02;
/*
 * JDK7出现了新的异常处理方案：
 * 		try{
 * 		}catch(异常名1|异常名2|异常名2 ... 变量){
 * 			......
 * 		}
 * 		缺点：	1.处理方式是一致的
 * 				2.多个异常间必须是平级关系
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
			System.out.println("出问题了");
		} 
		System.out.println("over");
	}
}
