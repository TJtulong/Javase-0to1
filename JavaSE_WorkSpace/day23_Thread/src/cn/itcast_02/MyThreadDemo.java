package cn.itcast_02;

/*
 * ��λ�ȡ�̶߳��������
 * public final String getName():��ȡ�̵߳�����
 * public final void setName(String name)�������̵߳�����
 */
public class MyThreadDemo {
	public static void main(String[] args) {
		// �޲ι���+setXxx
		MyThread my1 = new MyThread();
		MyThread my2 = new MyThread();

		my1.setName("������");
		my2.setName("Ҭ��Ƥ");

		my1.start();
		my2.start();

		// ���ι���
		MyThread my3 = new MyThread("����");
		my3.start();

		// ��ȡmain���������̶߳��������
		// ���ص�ǰ����ִ�е��̶߳���
		System.out.println(Thread.currentThread().getName());// main
	}
}
