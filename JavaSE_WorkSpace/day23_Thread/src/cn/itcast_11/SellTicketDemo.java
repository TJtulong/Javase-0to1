package cn.itcast_11;
/*
 * 出现了两个问题：线程安全问题
 * 出现重复：CPU的一次行操作必须是原子性的 tickets--
 * 出现负数：随机性和延迟导致的
 * java提供了同步代码块方法
 * synchronized(对象){需要同步的代码;}
 * 
 * 同步可以解决安全问题的根本原因在于对象，该对象如同锁的功能
 * 多个线程必须是同一把锁
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
