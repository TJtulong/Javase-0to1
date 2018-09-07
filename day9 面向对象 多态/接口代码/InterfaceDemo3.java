/*
	类与类：继承关系，只能单继承，可以多层继承
	类与接口：实现关系,可以单实现，也可以多实现，并且可以继承一个类的同时实现多个接口
	接口与接口：继承关系，可以单继承，也可以多继承
*/

interface Father{
	public abstract void show();
}

interface Mother{
	public abstract void show2();
}

interface Sister extends Father,Mother{}

class Son implements Father,Mother{
	public void show(){
		System.out.println("show son");
	}
	public void show2(){
		System.out.println("show2 son");
	}
}

class InterfaceDemo3{
	public static void main(String[] args){
		Father f = new Son();
		f.show();
		Mother m = new Son();
		m.show2();
	}
}