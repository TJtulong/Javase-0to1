package cn.itcast_07;

public abstract class GetTime {
	// 给出一段代码的运行时间
	public long getTime() {
		long start = System.currentTimeMillis();
		
		code();
		
		long end = System.currentTimeMillis();
		return end - start;
		
	}

	public abstract void code();

}
