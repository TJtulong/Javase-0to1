package cn.itcast_06;

import java.util.concurrent.Callable;
/*
 * Callable:是带泛型的接口
 * 这里的泛型是call()方法的返回值
 */
public class MyCallable implements Callable {

	@Override
	public Object call() throws Exception {
		for(int x=0;x<100;x++) {
			System.out.println(Thread.currentThread().getName()+":"+x);
		}
		return null;
	}

}
