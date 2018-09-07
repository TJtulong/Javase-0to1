package cn.itcast_08;

public class Direction {
	//构造私有，避免无限创建
	private Direction() {}
	
	public static final Direction FRONT = new Direction();
	public static final Direction BEHIND = new Direction();
	public static final Direction RIGHT = new Direction();
	public static final Direction LEFT = new Direction();
}
