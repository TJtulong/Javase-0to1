package cn.itcast_01;

/*
 * 异常：程序出现了不正常的情况
 * 程序的异常：Throwable
 * 		严重问题:Error 不处理（问题很严重，比如内存溢出）
 * 		问题：Exception
 * 			编译期问题:不是RuntimeException的异常 必须进行处理，否则编译不能通过
 * 			运行期问题:RuntimeException 不处理，代码不够严谨，需要修正代码
 * 如果程序出现问题，我们没有处理，jvm默认处理
 * 把异常的名称、原因及出现的问题等信息输出在控制台，同时会结束程序
 */
public class ExceptionDemo {
	public static void main(String[] args) {
		int a = 10;
		// int b=2;
		int b = 0;
		System.out.println(a / b);//ArithmeticException--->RuntimeException
		System.out.println("over");
	}
}
