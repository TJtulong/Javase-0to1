package cn.itcast_04;

/*
 * �߳��飺�Ѷ���߳������һ��
 * �����Զ�һ���߳̽��з������java�������ֱ�Ӷ��߳�����п���
 */
public class ThreadGroupDemo {
	public static void main(String[] args) {
		// method1();
		method2();
	}

	private static void method2() {
		// ����޸��߳���
		ThreadGroup tg = new ThreadGroup("����");

		MyRunnable my = new MyRunnable();
		Thread t1 = new Thread(tg, my, "������");
		Thread t2 = new Thread(tg, my, "Ҭ��Ƥ");
		
		ThreadGroup tg1 = t1.getThreadGroup();
		ThreadGroup tg2 = t2.getThreadGroup();
		System.out.println(tg1.getName());// main
		System.out.println(tg2.getName());
	}

	private static void method1() {
		MyRunnable my = new MyRunnable();
		Thread t1 = new Thread(my, "������");
		Thread t2 = new Thread(my, "Ҭ��Ƥ");

		// �߳�������ķ���
		ThreadGroup tg1 = t1.getThreadGroup();
		ThreadGroup tg2 = t2.getThreadGroup();

		// �߳�����ķ���
		System.out.println(tg1.getName());// main
		System.out.println(tg2.getName());// main
		System.out.println(Thread.currentThread().getThreadGroup().getName());// main
		// �߳�Ĭ������main�߳���
	}
}
