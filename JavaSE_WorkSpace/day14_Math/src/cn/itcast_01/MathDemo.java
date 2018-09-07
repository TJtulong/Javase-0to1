package cn.itcast_01;

/*
 * Math:用于数学运算的类
 * 	成员变量：
 * 		public static final double PI
 * 		public static final double PI
 * 	成员方法：
 * 		public static int abs(int a):绝对值
 * 		public static double ceil(double a):向上取整
 * 		public static double floor(double a):向下取整
 * 		public static int max(int a,int b)
 * 		public static double pow(double a,double b):a的b次幂
 * 		public static double random();随机数[0.0,1.0)
 * 		public static int round(float a):四舍五入
 * 		public static double sqrt(double a):算术平方根 		
 */
public class MathDemo {
	public static void main(String[] args) {
		System.out.println("pi=" + Math.PI);
		System.out.println("e=" + Math.E);

		System.out.println("abs=" + Math.abs(-10));

		System.out.println("ceil=" + Math.ceil(12.34));
		System.out.println("ceil=" + Math.ceil(12.78));

		System.out.println("floor=" + Math.floor(12.34));
		System.out.println("floor=" + Math.floor(12.78));

		System.out.println("max=" + Math.max(12, 23));
		System.out.println("max=" + Math.max(Math.max(12, 23), 44));

		System.out.println("pow=" + Math.pow(2, 3));

		System.out.println("random=" + Math.random());
		System.out.println("random=" + ((int) (100 * Math.random()) + 1));

		System.out.println("round=" + Math.round(12.34f));// float类型
		System.out.println("round=" + Math.round(12.56f));

		System.out.println("sqrt=" + Math.sqrt(6));

	}
}
