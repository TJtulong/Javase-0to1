package cn.itcast_02;
/*
 * 如果程序出现问题，我们没有处理，jvm默认处理
 * 自己处理：
 * 		1.try...catch...finally
 * 		格式：
 * 			try{
 * 				可能出现的代码
 * 			}catch(异常名变量){
 * 				针对问题的处理
 * 			}finally{
 * 				释放资源
 * 			}
 * 		变形格式
 * 			try{
 * 				可能出现的代码
 * 			}catch(异常名变量){
 * 				针对问题的处理
 * 			}
 * 		try里面的代码越少越好,catch里必须有内容，哪怕是一个简单的提示
 * 		2.throws 抛出
 */
public class ExceptionDemo {
	public static void main(String[] args) {
		int a = 10;
		// int b=2;
		int b = 0;
		
		try {
			System.out.println(a / b);
		}catch(ArithmeticException ae){
			System.out.println("除数不能为0");
		}
		System.out.println("over");
	}
}
