package cn.itcast_09;

public class MyRunnable implements Runnable{
	@Override
	public void run() {
		for(int x=0;x<100;x++) {
			//����ʵ���˽ӿڣ�����ʹ��getName()����
			System.out.println(Thread.currentThread().getName()+":"+x);
		}
	}
}
