package cn.itcast_09;

/*
 * ʵ�ֶ��̵߳ķ�ʽ2��ʵ��Runnable�ӿ�
 * ���裺
 * 		1.�Զ�����MyRunnableʵ��Runnable�ӿ�
 * 		2.��дrun()����
 * 		3.����MyRunnable�����
 * 		4.����Thread��Ķ��󣬲���C����Ķ�����Ϊ�����������
 */
public class MyRunnableDemo {
	public static void main(String[] args) {
		MyRunnable my = new MyRunnable();

//		Thread t1 = new Thread(my);
//		Thread t2 = new Thread(my);
//		
//		t1.setName("������");
//		t2.setName("����");
		
		Thread t1 = new Thread(my,"������");
		Thread t2 = new Thread(my,"����");

		t1.start();
		t2.start();
	}
}
