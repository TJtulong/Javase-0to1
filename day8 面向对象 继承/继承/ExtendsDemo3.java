/*
继承的注意事项
1.子类只能继承父类所有的非私有成员
2.子类不能继承父类的构造方法
3.不要为了部分功能而使用继承
什么时候考虑继承：
继承其实实现的是一种关系："is a"
采用假设法
*/
class Father{
	private int num = 10;
	public int num2 = 20;
	private void method(){
		System.out.println(num);
		System.out.println(num2);
	}
	public void show(){
		System.out.println(num);
		System.out.println(num2);
	}
}
class Son extends Father{
	public void function(){
		//System.out.println(num); 子类不能继承父类的私有成员
		System.out.println(num2);
	}
}
class ExtendsDemo3{
	public static void main(String[] args){
		Son s = new Son();
		s.show();
		//s.method() 子类不能继承父类的私有方法
		s.function();
	}
}