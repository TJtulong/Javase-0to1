//成员位置类

class Outer{
	private int num = 10;
	//成员位置
	class Inner{
		public void show(){
			System.out.println(num);
		}
	}
}


class InnerClassDemo2{
	public static void main(String[] args){
		Outer.Inner oi = new Outer().new Inner();
		oi.show();
	}
}