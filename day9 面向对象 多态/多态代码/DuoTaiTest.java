//è������
class Animal{
	public void eat(){
		System.out.println("eat");
	}
	public void sleep(){
		System.out.println("sleep");
	}
}

class Dog extends Animal{
	public void eat(){
		System.out.println("dog eat meat");
	}
	public void sleep(){
		System.out.println("dog sleep");
	}
}

class Cat extends Animal{
	public void eat(){
		System.out.println("cat eat fish");
	}
	public void sleep(){
		System.out.println("cat sleep");
	}
}
//��Զ�������Ĺ�����
class AnimalTool{
	private AnimalTool(){}
	/*
	public static void useCat(Cat c){
		c.eat();
		c.sleep();
	}
	public static void useDog(Dog d){
		d.eat();
		d.sleep();
	}
	*/
	public static void useAnimal(Animal a){
		a.eat();
		a.sleep();
	}
}

class DuoTaiTest{
	public static void main(String[] args){
		Cat c1 = new Cat();
		c1.eat();
		c1.sleep();
		Cat c2 = new Cat();
		c2.eat();
		c2.sleep();
		Dog d1 = new Dog();
		System.out.println("--------");
		//�÷����Ľ�
		AnimalTool.useAnimal(c1);
		AnimalTool.useAnimal(c2);
		AnimalTool.useAnimal(d1);	
		
		//��ϲ������������࣬�̳��Զ���ṩ��Ӧ�ķ�����д����ӹ��߷���
	}
}