package cn.itcast_03;
/*
 * ��Դ�ࣺѧ����
 * ����ѧ�����ݣ�SetThread(������)
 * ��ȡѧ�����ݣ�GetThread(������)
 * �����ࣺStudentDemo
 * 
 * ������������ݴ���������ͨ�����췽�����ݸ���������
 * ͬһ�����ݳ��ֶ��:
 * 		CPU��һ���ʱ��Ƭ�Ϳ�ִ�ж������
 * ���������䲻ƥ�䣺
 * 		�̰߳�ȫ����
 * 
 * ��������ͬ������̶߳�Ҫ������������ͬһ����
 * 
 * ���������������CPUִ��Ȩ���ͻ��������ݣ�����ʱ����û�в�����ΪĬ��ֵ
 * 
 * �ȴ����ѻ��ƣ�
 * Objext�����ṩ������������
 * 		wait():�ȴ�
 * 		notify():���ѵ����߳�
 * 		notifyAll():���������߳�
 * 		Ϊʲô��Щ������������Thread����?
 * 			��д�����ĵ��ñ���ͨ����������ã���������������������
 * 			�����Щ�������붨����Object����
 */
public class StudentDemo {
	public static void main(String[] args) {
		//������Դ
		Student s = new Student();
		
		SetThread st = new SetThread(s);
		GetThread gt = new GetThread(s);
		
		Thread t1 = new Thread(st);
		Thread t2 = new Thread(gt);
		
		t1.start();
		t2.start();
	}
}
