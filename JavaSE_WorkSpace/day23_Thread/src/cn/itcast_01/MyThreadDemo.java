package cn.itcast_01;

/*
 * 进程与线程
 * 
 * 举例：扫雷程序、迅雷下载
 * 需求：实现多线程的程序
 * 由于线程是由于进程而存在的，应该先创建一个进程
 * 进程是由系统创建的，java不能直接调用系统功能，java可以调用C/C++写好的程序实现
 * 提供一些类供使用，实现java的多线程
 * 
 * Thread  有2种方式实现多线程
 * 1.继承Thread类，重写run()方法，创建对象，启动线程
 */
public class MyThreadDemo {
	public static void main(String[] args) {
		// Mythread my = new Mythread();
		// my.run();
		// my.run();
		/*
		 * 调用run()方法其实就相当于普通方法调用，其实是单线程的 面试题：run()和start()的区别
		 * run():仅仅是封装该线程执行的代码，直接调用是普通方法 start():首先启动了线程，然后再由jvm去调用run()方法
		 */

		// my.start();
		// my.start();
		// IllegalThreadStateException非法的线程状态异常，相当于同一线程被调用两次

		Mythread my1 = new Mythread();
		Mythread my2 = new Mythread();
		my1.start();
		my2.start();
	}
}
