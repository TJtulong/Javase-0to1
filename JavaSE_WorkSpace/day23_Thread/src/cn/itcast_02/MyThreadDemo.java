package cn.itcast_02;

/*
 * 如何获取线程对象的名称
 * public final String getName():获取线程的名称
 * public final void setName(String name)：设置线程的名称
 */
public class MyThreadDemo {
	public static void main(String[] args) {
		// 无参构造+setXxx
		MyThread my1 = new MyThread();
		MyThread my2 = new MyThread();

		my1.setName("王若潇");
		my2.setName("椰子皮");

		my1.start();
		my2.start();

		// 带参构造
		MyThread my3 = new MyThread("屠龙");
		my3.start();

		// 获取main方法所在线程对象的名称
		// 返回当前正在执行的线程对象
		System.out.println(Thread.currentThread().getName());// main
	}
}
