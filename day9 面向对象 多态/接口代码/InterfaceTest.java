//定义调高接口
interface Jumping{
	public abstract void jump();
}

//动物抽象类
abstract class Animal{
	private String name;
	private int age;
	public Animal(){}
	public Animal(String name,int age){
		this.name = name;
		this.age = age;
	}
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public void setName(String name){
		this.name = name;
	}
	public void setAge(int age){
		this.age = age;
	}
	public abstract void eat();
	public void sleep(){
		System.out.println("睡觉");
	}
}

//具体猫类
class Cat extends Animal{
	public Cat(){}
	public Cat(String name,int age){
		super(name,age);
	}
	public void eat(){
		System.out.println("猫吃鱼");
	}
}

//具体狗类
class Dog extends Animal{
	public Dog(){}
	public Dog(String name,int age){
		super(name,age);
	}
	public void eat(){
		System.out.println("狗吃肉");
	}
}

//有调高功能的猫
class JumpCat extends Cat implements Jumping{
	public JumpCat(){}
	public JumpCat(String name,int age){
		super(name,age);
	}
	public void jump(){
		System.out.println("跳高猫");
	}
}

//有调高功能的狗
class JumpDog extends Dog implements Jumping{
	public JumpDog(){}
	public JumpDog(String name,int age){
		super(name,age);
	}
	public void jump(){
		System.out.println("跳高狗");
	}
}

class InterfaceTest{
	public static void main(String[] args){
		JumpCat jc = new JumpCat();
		jc.setName("Amy");
		jc.setAge(3);
		System.out.println(jc.getName()+"---"+jc.getAge());
		jc.eat();
		jc.sleep();
		jc.jump();
	}
}