package cn.itcast_01;

/*
 * �������߳�
 * 
 * ������ɨ�׳���Ѹ������
 * ����ʵ�ֶ��̵߳ĳ���
 * �����߳������ڽ��̶����ڵģ�Ӧ���ȴ���һ������
 * ��������ϵͳ�����ģ�java����ֱ�ӵ���ϵͳ���ܣ�java���Ե���C/C++д�õĳ���ʵ��
 * �ṩһЩ�๩ʹ�ã�ʵ��java�Ķ��߳�
 * 
 * Thread  ��2�ַ�ʽʵ�ֶ��߳�
 * 1.�̳�Thread�࣬��дrun()�������������������߳�
 */
public class MyThreadDemo {
	public static void main(String[] args) {
		// Mythread my = new Mythread();
		// my.run();
		// my.run();
		/*
		 * ����run()������ʵ���൱����ͨ�������ã���ʵ�ǵ��̵߳� �����⣺run()��start()������
		 * run():�����Ƿ�װ���߳�ִ�еĴ��룬ֱ�ӵ�������ͨ���� start():�����������̣߳�Ȼ������jvmȥ����run()����
		 */

		// my.start();
		// my.start();
		// IllegalThreadStateException�Ƿ����߳�״̬�쳣���൱��ͬһ�̱߳���������

		Mythread my1 = new Mythread();
		Mythread my2 = new Mythread();
		my1.start();
		my2.start();
	}
}
