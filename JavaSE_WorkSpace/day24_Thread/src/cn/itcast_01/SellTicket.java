package cn.itcast_01;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
 * JDK5���ṩ���µ�������Lock
 * void lock():��ȡ��
 * void unlock():�ͷ���
 * ReentrantLock��Lock�ӿڵ�ʵ����
 */
public class SellTicket implements Runnable {
	private int tickets = 100;

	// ����������
	private Lock lock = new ReentrantLock();

	@Override
	public void run() {
		while (true) {
			// ����
			lock.lock();
			try {
				if (tickets > 0) {
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

					System.out.println(Thread.currentThread().getName() + "�����۵�" + (tickets--) + "��Ʊ");
				}
			} finally {
				// �ͷ���
				lock.unlock();
			}
		}
	}

}
