package cn.itcast_07;

public abstract class GetTime {
	// ����һ�δ��������ʱ��
	public long getTime() {
		long start = System.currentTimeMillis();
		
		code();
		
		long end = System.currentTimeMillis();
		return end - start;
		
	}

	public abstract void code();

}
