package cn.itcast_09;

/*
 * ͨ��JDK5�Ժ��ö��������ö��
 */
public enum Direction2 {
	FRONT("ǰ"), BEHIND("��"), LEFT("��"), RIGHT("��");
	private String name;

	private Direction2(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}