package cn.itcast_05;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
 * 线程池中的每一个代码结束后并不会死亡，而是再次回到线程池中成为空闲状态，等代下一个对象使用
 * 
 * 如何实现线程池：
 * 1.创建一个线程池对象，并控制靠创建几个线程对象
 * 2.线程池的线程可以执行：Runnalbe或Callable对象的线程
 * 3.调用方法 submit
 */
public class ExecutorsDemo {
	public static void main(String[] args) {
		ExecutorService pool =Executors.newFixedThreadPool(2);
		
		pool.submit(new MyRunnable());
		pool.submit(new MyRunnable());
		
		//结束线程池
		pool.shutdown();
	}
}
