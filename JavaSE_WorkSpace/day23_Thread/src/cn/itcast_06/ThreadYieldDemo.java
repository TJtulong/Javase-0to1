package cn.itcast_06;
/*
 * public static void yield():暂停当前的线程，并执行其它的线程
 * 让多个线程的执行更和谐，但不能保证一人一次
 */
public class ThreadYieldDemo {
	public static void main(String[] args) {
		ThreadYield ty1 = new ThreadYield();
		ThreadYield ty2 = new ThreadYield();
		
		ty1.setName("a");
		ty2.setName("b");
		
		ty1.start();
		ty2.start();
	}
}
