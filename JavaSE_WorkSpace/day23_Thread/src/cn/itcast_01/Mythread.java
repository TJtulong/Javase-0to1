package cn.itcast_01;
/*
 * Ϊʲô��дrun()����
 * �����߳������еĴ��붼��Ҫ���߳�ִ�еģ�Ϊ��������Щ�����ܹ����߳�ִ�У�Thread���ṩ��run����
 */
public class Mythread extends Thread {
	@Override
	public void run() {
		// ���߳�ִ�еĴ���һ���ǱȽϺ�ʱ��
		for(int x =0;x<100;x++) {
			System.out.println(x);
		}
	}
}
