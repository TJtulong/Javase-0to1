/*
不仅要输出局部范围的num，还要输出成员范围的num
还要输出父类成员范围的num：super
*/
class Father{
	public int num = 10;
}
class Son extends Father{
	private int num = 20;
	public void show(){
		int num = 30;
		System.out.println(num);
		System.out.println(this.num);
		System.out.println(super.num);
	}
}
class ExtendsDemo4{
	public static void main(String[] args){
		Son s = new Son();
		s.show();
	}
}