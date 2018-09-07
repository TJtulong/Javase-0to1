package cn.itcast_01;
/*
 * 为什么重写run()方法
 * 不是线程中所有的代码都需要被线程执行的，为了区分哪些代码能够被线程执行，Thread中提供了run方法
 */
public class Mythread extends Thread {
	@Override
	public void run() {
		// 被线程执行的代码一般是比较耗时的
		for(int x =0;x<100;x++) {
			System.out.println(x);
		}
	}
}
