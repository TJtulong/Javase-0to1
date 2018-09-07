package cn.itcast_03;

/*
 * public static void exit(int status)
 * 		终止当前正在运行的java虚拟机，参数用作状态码，根据惯例，非0的状态码表示异常终止
 * public static long currentTimeMillis()
 * 		返回以毫秒为单位的当前时间
 */
public class SystemDemo2 {
	public static void main(String[] args) {
		System.out.println("hhhhh");
		// System.exit(0);
		System.out.println("bainiangzi");
		// System.out.println(System.currentTimeMillis());
		long start = System.currentTimeMillis();
		//可以用来测试运行时间
		for (int x = 0; x < 100000; x++) {
			System.out.println("hello" + x);
		}
		long end = System.currentTimeMillis();
		System.out.println("用时" + (end - start) + "毫秒");
	}
}
