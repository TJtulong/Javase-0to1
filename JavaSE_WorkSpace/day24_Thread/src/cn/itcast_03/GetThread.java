package cn.itcast_03;

public class GetThread implements Runnable {
	private Student s;

	public GetThread(Student s) {
		this.s = s;
	}

	@Override
	public void run() {
		while (true) {
			synchronized (s) {
				if(!s.flag) {
					try {
						s.wait();//t2等待，立即释放锁，醒过来时从这里继续
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println(s.name + ":" + s.age);
				s.flag=false;
				s.notify();
			}
		}
	}
}
