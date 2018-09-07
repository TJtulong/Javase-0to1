package cn.itcast_08;
/*
 * public final void stop():方法已过时
 * public void interrupt():中断线程,把线程的状态终止，并抛出InterruptedException
 */
public class ThreadStopDemo {
	public static void main(String[] args){
		ThreadStop ts = new ThreadStop();
		ts.start();
		
		//超过3秒结束
		try {
			Thread.sleep(3000);
			//ts.stop();不建议使用
			ts.interrupt();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
