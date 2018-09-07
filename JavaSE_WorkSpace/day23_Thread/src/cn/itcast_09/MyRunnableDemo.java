package cn.itcast_09;

/*
 * 实现多线程的方式2：实现Runnable接口
 * 步骤：
 * 		1.自定义类MyRunnable实现Runnable接口
 * 		2.重写run()方法
 * 		3.创建MyRunnable类对象
 * 		4.创建Thread类的对象，并把C步骤的对象作为构造参数传递
 */
public class MyRunnableDemo {
	public static void main(String[] args) {
		MyRunnable my = new MyRunnable();

//		Thread t1 = new Thread(my);
//		Thread t2 = new Thread(my);
//		
//		t1.setName("王若潇");
//		t2.setName("屠龙");
		
		Thread t1 = new Thread(my,"王若潇");
		Thread t2 = new Thread(my,"屠龙");

		t1.start();
		t2.start();
	}
}
