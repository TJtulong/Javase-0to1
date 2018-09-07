package cn.itcast_02;
/*
 * ËÀËøÎÊÌâ
 */
public class DieLockDemo {
	public static void main(String[] args) {
		DieLock d11 = new DieLock(true);
		DieLock d12 = new DieLock(false);
		
		d11.start();
		d12.start();
	}
}
