package cn.itcast_09;

import java.util.Timer;
import java.util.TimerTask;

/*
 * 定时器：可以让我们在指定时间做某件事，也可以重复做某件事
 * 依赖Timer和TimerTask两个类
 * Timer：定时
 * TimerTask：任务
 */
public class TimerDemo2 {
	public static void main(String[] args) {
		// 创建定时器对象
		Timer t = new Timer();
		
		//三秒后执行任务,之后每个两秒执行一次
		t.schedule(new MyTask2(), 3000,2000);
	}
}

class MyTask2 extends TimerTask {
	
	@Override
	public void run() {
		System.out.println("hello");
	}
}