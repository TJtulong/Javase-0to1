package cn.itcast_05;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
 * �̳߳��е�ÿһ����������󲢲��������������ٴλص��̳߳��г�Ϊ����״̬���ȴ���һ������ʹ��
 * 
 * ���ʵ���̳߳أ�
 * 1.����һ���̳߳ض��󣬲����ƿ����������̶߳���
 * 2.�̳߳ص��߳̿���ִ�У�Runnalbe��Callable������߳�
 * 3.���÷��� submit
 */
public class ExecutorsDemo {
	public static void main(String[] args) {
		ExecutorService pool =Executors.newFixedThreadPool(2);
		
		pool.submit(new MyRunnable());
		pool.submit(new MyRunnable());
		
		//�����̳߳�
		pool.shutdown();
	}
}
