package cn.itcast_09;

import java.util.Timer;
import java.util.TimerTask;

/*
 * ��ʱ����������������ָ��ʱ����ĳ���£�Ҳ�����ظ���ĳ����
 * ����Timer��TimerTask������
 * Timer����ʱ
 * TimerTask������
 */
public class TimerDemo2 {
	public static void main(String[] args) {
		// ������ʱ������
		Timer t = new Timer();
		
		//�����ִ������,֮��ÿ������ִ��һ��
		t.schedule(new MyTask2(), 3000,2000);
	}
}

class MyTask2 extends TimerTask {
	
	@Override
	public void run() {
		System.out.println("hello");
	}
}