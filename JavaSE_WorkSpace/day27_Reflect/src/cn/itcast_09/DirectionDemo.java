package cn.itcast_09;

public class DirectionDemo {
	public static void main(String[] args) {
		Direction d = Direction.FRONT;
		System.out.println(d);//FRONT
		System.out.println("------");
		
		Direction2 d2 = Direction2.FRONT;//FRONT
		System.out.println(d2);
		System.out.println(d2.getName());//ǰ
		System.out.println("------");
		
		/*Direction3 d3 = Direction3.FRONT;
		System.out.println(d3);
		System.out.println(d3.getName());
		d3.show();*/
	}
}
