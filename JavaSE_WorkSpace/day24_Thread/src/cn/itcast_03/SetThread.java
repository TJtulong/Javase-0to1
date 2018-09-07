package cn.itcast_03;

public class SetThread implements Runnable {
	private Student s;
	private int x;

	public SetThread(Student s) {
		this.s = s;
	}

	@Override
	public void run() {
		while (true) {
			synchronized (s) {
				if (s.flag) {
					try {
						s.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				if (x % 2 == 0) {
					s.name = "椰子皮";// 刚执行到这里就被别人抢到了执行权
					s.age = 22;
				} else {
					s.name = "屠龙";// 刚执行到这里就被别人抢到了执行权
					s.age = 23;
				}
				x++;
				s.flag = true;
				s.notify();// 唤醒t2，唤醒并不表示可以立即执行，还要抢CPU执行权
			}
		}
	}
}
