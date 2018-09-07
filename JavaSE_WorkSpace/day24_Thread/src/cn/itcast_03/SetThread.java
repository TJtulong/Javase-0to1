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
					s.name = "Ҭ��Ƥ";// ��ִ�е�����ͱ�����������ִ��Ȩ
					s.age = 22;
				} else {
					s.name = "����";// ��ִ�е�����ͱ�����������ִ��Ȩ
					s.age = 23;
				}
				x++;
				s.flag = true;
				s.notify();// ����t2�����Ѳ�����ʾ��������ִ�У���Ҫ��CPUִ��Ȩ
			}
		}
	}
}
