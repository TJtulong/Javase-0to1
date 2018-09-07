package cn.itcast_06;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
 * 多线程实现的方式3
 */
public class CallableDemo {
	public static void main(String[] args) {
		ExecutorService pool =Executors.newFixedThreadPool(2);
		
		pool.submit(new MyCallable());
		pool.submit(new MyCallable());
		
		pool.shutdown();
	}
}
