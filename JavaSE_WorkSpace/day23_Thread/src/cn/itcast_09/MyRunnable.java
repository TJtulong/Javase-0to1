package cn.itcast_09;

public class MyRunnable implements Runnable{
	@Override
	public void run() {
		for(int x=0;x<100;x++) {
			//由于实现了接口，不能使用getName()方法
			System.out.println(Thread.currentThread().getName()+":"+x);
		}
	}
}
