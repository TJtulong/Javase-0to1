package cn.itcast_10;

public class SellTicket implements Runnable {
	// 若用方式1：为了让多个线程共享这100张票，应该用静态修饰
	// private static int tickets = 100;
	// 采用方式2：不需要static
	private int tickets = 100;

	@Override
	public void run() {
		while (true) {
			if (tickets > 0) {
				// 考虑网络的延迟，稍作休息
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName() + "正在售第" + (tickets--) + "张票");
			}
		}
	}
}
