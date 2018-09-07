/*
1.子类的所有构造方法都会默认访问父类的无参构造方法
子类初始化之前，一定要完成父类的初始化
注意：子类每一个构造方法的第一条默认语句都是super()
*/
class Father{
	public Father(){
		
		System.out.println("father的无参构造方法");
	}
	public Father(String name){
		System.out.println("father的带参构造方法");
	}
}
class Son extends Father{
	public Son(){
		super();//默认有
		System.out.println("son的无参构造方法");
	}
	public Son(String name){
		System.out.println("son的带参构造方法");
	}
}
class ExtendsDemo5{
	public static void main(String[] args){
		Son s1 = new Son();
		System.out.println("-------------");
		Son s2 = new Son("王若潇");
	}
}
/*
father的无参构造方法
son的无参构造方法
-------------
father的无参构造方法
son的带参构造方法
*/