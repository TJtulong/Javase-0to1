package cn.itcast_03;

/*
 * �߳����ȼ�
 * ��ȡ�̶߳�������ȼ�:public final int getPriority()
 * �߳�Ĭ�����ȼ�Ϊ5
 * �����߳����ȼ���public final void setPriority(int newPriority)
 * ������ȼ�Ϊ10��������ȼ�Ϊ1
 * �߳����ȼ�������ʾ�̻߳�ȡCPUʱ��Ƭ�ļ��ʣ�����Ҫ�ڶ�����е�ʱ����ܿ����ȽϺõ�Ч��
 */
public class ThreadPriorityDemo {
	public static void main(String[] args) {
		ThreadPriority tp1 = new ThreadPriority();
		ThreadPriority tp2 = new ThreadPriority();
		ThreadPriority tp3 = new ThreadPriority();

		tp1.setName("������");
		tp2.setName("Ҭ��Ƥ");
		tp3.setName("����");

		System.out.println(tp1.getPriority());// 5
		System.out.println(tp2.getPriority());// 5
		System.out.println(tp3.getPriority());// 5

		tp1.setPriority(10);
		tp2.setPriority(1);

		tp1.start();
		tp2.start();
		tp3.start();
	}
}
