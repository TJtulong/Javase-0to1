package cn.itcast_08;
/*
 * public final void stop():�����ѹ�ʱ
 * public void interrupt():�ж��߳�,���̵߳�״̬��ֹ�����׳�InterruptedException
 */
public class ThreadStopDemo {
	public static void main(String[] args){
		ThreadStop ts = new ThreadStop();
		ts.start();
		
		//����3�����
		try {
			Thread.sleep(3000);
			//ts.stop();������ʹ��
			ts.interrupt();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
