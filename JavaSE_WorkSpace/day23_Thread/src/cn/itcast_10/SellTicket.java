package cn.itcast_10;

public class SellTicket implements Runnable {
	// ���÷�ʽ1��Ϊ���ö���̹߳�����100��Ʊ��Ӧ���þ�̬����
	// private static int tickets = 100;
	// ���÷�ʽ2������Ҫstatic
	private int tickets = 100;

	@Override
	public void run() {
		while (true) {
			if (tickets > 0) {
				// ����������ӳ٣�������Ϣ
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName() + "�����۵�" + (tickets--) + "��Ʊ");
			}
		}
	}
}
