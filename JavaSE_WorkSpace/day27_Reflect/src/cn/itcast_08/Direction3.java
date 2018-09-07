package cn.itcast_08;

public abstract class Direction3 {
	//�����ڲ���
	public static final Direction3 FRONT = new Direction3("ǰ") {
		public void show() {
			System.out.println("ǰ");
		}		
	};
	public static final Direction3 BEHIND = new Direction3("��"){
		public void show() {
			System.out.println("��");
		}		
	};;
	public static final Direction3 RIGHT = new Direction3("��"){
		public void show() {
			System.out.println("��");
		}		
	};;
	public static final Direction3 LEFT = new Direction3("��"){
		public void show() {
			System.out.println("��");
		}		
	};;
	
	private String name;
	
	private Direction3(String name) {
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
	
	//������󷽷�
	public abstract void show();
}
