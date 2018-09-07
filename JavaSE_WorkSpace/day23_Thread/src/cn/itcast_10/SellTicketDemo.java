package cn.itcast_10;
/*
 * 模拟电影院售票，共100张票，共有3个售票窗口
 * 3个线程
 * 
 * 模拟延迟100毫秒
 * 出现了两个问题：线程安全问题
 * 出现重复：CPU的一次行操作必须是原子性的 tickets--
 * 出现负数：随机性和延迟导致的
 * 
 */
public class SellTicketDemo {
	public static void main(String[] args) {
		SellTicket st = new SellTicket();
		
		Thread t1 = new Thread(st, "窗口1");
		Thread t2 = new Thread(st, "窗口2");
		Thread t3 = new Thread(st, "窗口3");
		
		t1.start();
		t2.start();
		t3.start();	}
}
