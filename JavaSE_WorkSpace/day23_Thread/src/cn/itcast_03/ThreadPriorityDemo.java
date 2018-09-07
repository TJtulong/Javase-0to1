package cn.itcast_03;

/*
 * 线程优先级
 * 获取线程对象的优先级:public final int getPriority()
 * 线程默认优先级为5
 * 设置线程优先级：public final void setPriority(int newPriority)
 * 最高优先级为10，最低优先级为1
 * 线程优先级仅仅表示线程获取CPU时间片的几率，但是要在多次运行的时候才能看到比较好的效果
 */
public class ThreadPriorityDemo {
	public static void main(String[] args) {
		ThreadPriority tp1 = new ThreadPriority();
		ThreadPriority tp2 = new ThreadPriority();
		ThreadPriority tp3 = new ThreadPriority();

		tp1.setName("王若潇");
		tp2.setName("椰子皮");
		tp3.setName("屠龙");

		System.out.println(tp1.getPriority());// 5
		System.out.println(tp2.getPriority());// 5
		System.out.println(tp3.getPriority());// 5

		tp1.setPriority(10);
		tp2.setPriority(1);

		tp1.start();
		tp2.start();
		tp3.start();
	}
}
