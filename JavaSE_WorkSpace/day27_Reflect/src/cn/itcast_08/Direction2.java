package cn.itcast_08;

public class Direction2 {
	public static final Direction2 FRONT = new Direction2("ǰ");
	public static final Direction2 BEHIND = new Direction2("��");
	public static final Direction2 RIGHT = new Direction2("��");
	public static final Direction2 LEFT = new Direction2("��");
	
	private String name;
	
	private Direction2(String name) {
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
}
