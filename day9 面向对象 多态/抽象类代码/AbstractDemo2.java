/*
抽象类的成员特点：
	成员变量：既可以是变量，也可以是常量
	构造方法：有，用于子类访问父类数据的初始化
	成员方法：既可以是抽象的，也可以是非抽象的
抽象方法特性：1.抽象方法：强制子类做的事
			  2.非抽象方法：子类继承的事情，提高代码复用性
*/
abstract class Animal{
	public int num = 10;
	public final int num2 = 20;
	public Animal(){}
	public Animal(String[] args){}
	public abstract void show(){}
	public void method(){
		System.out.println("method");
	}
}

class Dog extends Animal{
	public void show(){
		System.out.println("dog");
	}
}

class AbstractDemo2{
	public static void main(String[] args){
		Animal a = new Dog();
		a.num = 100;
		System.out.println(a.num);
		System.out.println(a.num2);
		a.show();
		a.method();
	}
}