package cn.itcast_05;

/*
 * public final void join():�ȴ����߳���ֹ
 */
public class ThreadJoinDemo {
	public static void main(String[] args) throws InterruptedException {
		ThreadJoin tj1 = new ThreadJoin();
		ThreadJoin tj2 = new ThreadJoin();
		ThreadJoin tj3 = new ThreadJoin();

		tj1.setName("a");
		tj2.setName("b");
		tj3.setName("c");

		tj1.start();
		tj1.join();// ���߳�ִ�������ִ�������߳�
		tj2.start();
		tj3.start();

	}
}
