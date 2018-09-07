package cn.itcast_04;
/*
 * Ïß³ÌĞİÃß£ºpublic static void sleep(long millis)
 */
public class ThreadSleepDemo {
	public static void main(String[] args) {
		ThreadSleep ts1 = new ThreadSleep();
		ThreadSleep ts2 = new ThreadSleep();
		ThreadSleep ts3 = new ThreadSleep();
		
		ts1.setName("ÍõÈôäì");
		ts2.setName("Ò¬×ÓÆ¤");
		ts3.setName("ÍÀÁú");
		
		ts1.start();
		ts2.start();
		ts3.start();
	}
	
}
