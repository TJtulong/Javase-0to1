class A{
	public void show(){
		show2();
	}
	public void show2(){
		System.out.println("I");
	}
}

class B extends A{
	public void show2(){
		System.out.println("Love");
	}
}

class C extends B{
	public void show(){
		super.show();
	}
	public void show2(){
		System.out.println("You");
	}
}

public class DuoTaiTest2{
	public static void main(String[] args){
		A a = new B();
		a.show();//Love
		B b = new C();
		b.show();//You
		C c = new C();
		c.show();//You
	}
}