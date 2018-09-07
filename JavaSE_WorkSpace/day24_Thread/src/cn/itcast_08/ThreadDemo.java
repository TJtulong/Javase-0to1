package cn.itcast_08;

/*
 * �����ڲ���Ľ����߳�
 */
public class ThreadDemo {
	public static void main(String[] args) {
		// �̳�Thread����ʵ�ֶ��߳�
		new Thread() {
			@Override
			public void run() {
				for (int x = 0; x < 100; x++) {
					System.out.println(Thread.currentThread().getName() + ":" + x);
				}
			}
		}.start();

		// ʵ��Runnable��ʵ�ֶ��߳�
		new Thread(new Runnable() {

			@Override
			public void run() {
				for (int x = 0; x < 100; x++) {
					System.out.println(Thread.currentThread().getName() + ":" + x);
				}
			}
		}) {
		}.start();

		// �����Ѷȵ�
		new Thread(new Runnable() {

			@Override
			public void run() {
				for (int x = 0; x < 100; x++) {
					System.out.println("hello" + ":" + x);
				}
			}
		}) {
			public void run() {
				for (int x = 0; x < 100; x++) {
					System.out.println("world" + ":" + x);
				}
			}
		}.start();//���world
	}
}
