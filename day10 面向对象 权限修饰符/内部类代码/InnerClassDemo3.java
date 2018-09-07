//成员内部类的修饰符

class Body{
	private class Heart{
		public void operateor(){
			System.out.println("心脏搭桥");
		}
	}
	
	public void method(){
		Heart h = new Heart();
		h.operateor();
	}
}

class Outer{
	private int num =10;
	private static int num2 =10;
	//注意：静态内部类访问的外部类数据必须用静态修饰
	public static class Inner{
		public void show(){
			//System.out.println(num);
			System.out.println(num2);
		}
		public static void show2(){
			//System.out.println(num);
			System.out.println(num2);
		}
	}
}

class InnerClassDemo3{
	public static void main(String[] args){
		Body b = new Body();
		b.method();
		
		//成员内部类被静态修饰后的访问方式
		Outer.Inner oi = new Outer.Inner();
		oi.show();
		oi.show2();
		
		//show2的另一种调用方式
		Outer.Inner.show2();
	}
}