package cn.itcast_03;
/*
 * 资源类：学生类
 * 设置学生数据：SetThread(生产者)
 * 获取学生数据：GetThread(消费者)
 * 测试类：StudentDemo
 * 
 * 在外界把这个数据创建出来，通过构造方法传递给其它的类
 * 同一个数据出现多次:
 * 		CPU的一点点时间片就可执行多条语句
 * 姓名和年龄不匹配：
 * 		线程安全问题
 * 
 * 加锁：不同种类的线程都要加锁，并且是同一把锁
 * 
 * 如果消费者先抢到CPU执行权，就会消费数据，但此时数据没有产生，为默认值
 * 
 * 等代唤醒机制：
 * Objext类中提供了三个方法：
 * 		wait():等代
 * 		notify():唤醒单个线程
 * 		notifyAll():唤醒所有线程
 * 		为什么这些方法不定义在Thread类中?
 * 			这写方法的调用必须通过锁对象调用，而锁对象是任意锁对象
 * 			因此这些方法必须定义在Object类中
 */
public class StudentDemo {
	public static void main(String[] args) {
		//创建资源
		Student s = new Student();
		
		SetThread st = new SetThread(s);
		GetThread gt = new GetThread(s);
		
		Thread t1 = new Thread(st);
		Thread t2 = new Thread(gt);
		
		t1.start();
		t2.start();
	}
}
