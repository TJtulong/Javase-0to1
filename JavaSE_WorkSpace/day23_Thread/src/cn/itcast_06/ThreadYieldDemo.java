package cn.itcast_06;
/*
 * public static void yield():��ͣ��ǰ���̣߳���ִ���������߳�
 * �ö���̵߳�ִ�и���г�������ܱ�֤һ��һ��
 */
public class ThreadYieldDemo {
	public static void main(String[] args) {
		ThreadYield ty1 = new ThreadYield();
		ThreadYield ty2 = new ThreadYield();
		
		ty1.setName("a");
		ty2.setName("b");
		
		ty1.start();
		ty2.start();
	}
}
