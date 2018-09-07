//������߽ӿ�
interface Jumping{
	public abstract void jump();
}

//���������
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
		System.out.println("˯��");
	}
}

//����è��
class Cat extends Animal{
	public Cat(){}
	public Cat(String name,int age){
		super(name,age);
	}
	public void eat(){
		System.out.println("è����");
	}
}

//���幷��
class Dog extends Animal{
	public Dog(){}
	public Dog(String name,int age){
		super(name,age);
	}
	public void eat(){
		System.out.println("������");
	}
}

//�е��߹��ܵ�è
class JumpCat extends Cat implements Jumping{
	public JumpCat(){}
	public JumpCat(String name,int age){
		super(name,age);
	}
	public void jump(){
		System.out.println("����è");
	}
}

//�е��߹��ܵĹ�
class JumpDog extends Dog implements Jumping{
	public JumpDog(){}
	public JumpDog(String name,int age){
		super(name,age);
	}
	public void jump(){
		System.out.println("���߹�");
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