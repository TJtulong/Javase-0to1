package cn.itcast_04;
/*
 * �߳����ߣ�public static void sleep(long millis)
 */
public class ThreadSleepDemo {
	public static void main(String[] args) {
		ThreadSleep ts1 = new ThreadSleep();
		ThreadSleep ts2 = new ThreadSleep();
		ThreadSleep ts3 = new ThreadSleep();
		
		ts1.setName("������");
		ts2.setName("Ҭ��Ƥ");
		ts3.setName("����");
		
		ts1.start();
		ts2.start();
		ts3.start();
	}
	
}
