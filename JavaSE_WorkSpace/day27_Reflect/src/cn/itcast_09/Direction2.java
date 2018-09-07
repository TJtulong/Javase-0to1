package cn.itcast_09;

/*
 * 通过JDK5以后的枚举类来作枚举
 */
public enum Direction2 {
	FRONT("前"), BEHIND("后"), LEFT("左"), RIGHT("右");
	private String name;

	private Direction2(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
