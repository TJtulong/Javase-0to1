package cn.itcast_04;

/*
 * 线程组：把多个线程组合在一起
 * 它可以对一批线程进行分类管理，java允许程序直接对线程组进行控制
 */
public class ThreadGroupDemo {
	public static void main(String[] args) {
		// method1();
		method2();
	}

	private static void method2() {
		// 如何修改线程组
		ThreadGroup tg = new ThreadGroup("新组");

		MyRunnable my = new MyRunnable();
		Thread t1 = new Thread(tg, my, "王若潇");
		Thread t2 = new Thread(tg, my, "椰子皮");
		
		ThreadGroup tg1 = t1.getThreadGroup();
		ThreadGroup tg2 = t2.getThreadGroup();
		System.out.println(tg1.getName());// main
		System.out.println(tg2.getName());
	}

	private static void method1() {
		MyRunnable my = new MyRunnable();
		Thread t1 = new Thread(my, "王若潇");
		Thread t2 = new Thread(my, "椰子皮");

		// 线程类里面的方法
		ThreadGroup tg1 = t1.getThreadGroup();
		ThreadGroup tg2 = t2.getThreadGroup();

		// 线程组里的方法
		System.out.println(tg1.getName());// main
		System.out.println(tg2.getName());// main
		System.out.println(Thread.currentThread().getThreadGroup().getName());// main
		// 线程默认属于main线程组
	}
}
