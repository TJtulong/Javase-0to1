abstract class Animal{
	//���󷽷�
	public abstract void eat();
	//public abstract void eat(){}  �շ����壬�ᱨ��
	public Animal(){}
}
abstract class Dog extends Animal{}

class Cat extends Animal{
	public void eat(){
		System.out.println("è����");
	}
}

class AbstractDemo{
	public static void main(String[] args){
		//ͨ����̬�ķ���ʵ����
		Animal a = new Cat();
		a.eat();//è����
	}
}