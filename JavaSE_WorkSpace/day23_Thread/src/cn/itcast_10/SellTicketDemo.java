package cn.itcast_10;
/*
 * ģ���ӰԺ��Ʊ����100��Ʊ������3����Ʊ����
 * 3���߳�
 * 
 * ģ���ӳ�100����
 * �������������⣺�̰߳�ȫ����
 * �����ظ���CPU��һ���в���������ԭ���Ե� tickets--
 * ���ָ���������Ժ��ӳٵ��µ�
 * 
 */
public class SellTicketDemo {
	public static void main(String[] args) {
		SellTicket st = new SellTicket();
		
		Thread t1 = new Thread(st, "����1");
		Thread t2 = new Thread(st, "����2");
		Thread t3 = new Thread(st, "����3");
		
		t1.start();
		t2.start();
		t3.start();	}
}
