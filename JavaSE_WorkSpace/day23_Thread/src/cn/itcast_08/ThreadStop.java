package cn.itcast_08;

import java.util.Date;

public class ThreadStop extends Thread {
	@Override
	public void run() {
		System.out.println("��ʼִ��"+new Date());
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			System.out.println("�߳��ж�");
		}
		
		System.out.println("����ִ��"+new Date());
	}
}
