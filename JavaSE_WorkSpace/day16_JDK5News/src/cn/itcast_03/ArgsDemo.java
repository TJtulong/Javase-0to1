package cn.itcast_03;

/*
 * 	可变参数：定义参数时不知道有多少参数
 * 	格式：
 * 			修饰符 返回值类型 方法名(数据类型... 变量名){}
 * 	这里的变量是一个数组
 * 	可变参数一定是最后一个
 */
public class ArgsDemo {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int result = sum(a, b);
		System.out.println("result=" + result);

		int c = 30;
		result = sum(a, b, c);
		System.out.println("result=" + result);
	}

	public static int sum(int... a) {
		int s=0;
		for(int x:a) {
			s+=s;
		}
		return s;
	}
}
