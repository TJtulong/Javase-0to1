abstract class Animal{
	//抽象方法
	public abstract void eat();
	//public abstract void eat(){}  空方法体，会报错
	public Animal(){}
}
abstract class Dog extends Animal{}

class Cat extends Animal{
	public void eat(){
		System.out.println("猫吃鱼");
	}
}

class AbstractDemo{
	public static void main(String[] args){
		//通过多态的方法实例化
		Animal a = new Cat();
		a.eat();//猫吃鱼
	}
}