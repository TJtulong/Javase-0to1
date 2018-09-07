package cn.itcast_09;

import java.util.Timer;
import java.util.TimerTask;

/*
 * ��ʱ����������������ָ��ʱ����ĳ���£�Ҳ�����ظ���ĳ����
 * ����Timer��TimerTask������
 * Timer����ʱ
 * TimerTask������
 */
public class TimerDemo {
	public static void main(String[] args) {
		// ������ʱ������
		Timer t = new Timer();
		
		//�����ִ������
		t.schedule(new MyTask(t), 3000);
	}
}

class MyTask extends TimerTask {
	private Timer t;
	public MyTask() {}
	
	public MyTask(Timer t) {
		this.t=t;
	}
	
	@Override
	public void run() {
		System.out.println("hello");
		t.cancel();
	}
}