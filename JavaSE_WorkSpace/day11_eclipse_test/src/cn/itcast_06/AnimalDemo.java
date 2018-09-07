package cn.itcast_06;

import com.xiao_02.Animal;
import com.xiao_02.Cat;
import com.xiao_02.Dog;

public class AnimalDemo {
	public static void main(String[] args) {
		Animal a = new Cat();
		a.eat();
		a.sleep();
		System.out.println("------------");
		Animal d = new Dog();
		d.eat();
		d.sleep();
		System.out.println("------------");
		Dog d1 = new Dog();
		d1.eat();
		d1.sleep();
		d1.jump();

	}
}
