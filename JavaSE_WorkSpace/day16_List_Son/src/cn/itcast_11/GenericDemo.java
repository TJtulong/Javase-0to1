package cn.itcast_11;

/*
 * 	通配符：
 * 	?：任意类型：如果没有明确，那么就是Object及任意java类
 * 	? extends E:向下限定，E及其子类
 *  ? super E:向上限定，E及其父类
 */
import java.util.ArrayList;
import java.util.Collection;

public class GenericDemo {
	public static void main(String[] args) {
		// 泛型如果明确写的时候，前后必须一致
		Collection<Object> c = new ArrayList<Object>();
		// Collection<Object> c2=new ArrayList<Animal>();

		// ?表示任意类型都是可以的
		Collection<?> c3 = new ArrayList<Object>();
		Collection<?> c4 = new ArrayList<Animal>();
		Collection<?> c5 = new ArrayList<Cat>();
		Collection<?> c6 = new ArrayList<Dog>();

		// ? extends E
		// Collection<? extends Animal> c7=new ArrayList<Object>();
		Collection<? extends Animal> c8 = new ArrayList<Animal>();
		Collection<? extends Animal> c9 = new ArrayList<Cat>();
		Collection<? extends Animal> c10 = new ArrayList<Dog>();

		// ? extends E
		Collection<? super Animal> c11=new ArrayList<Object>();
		Collection<? super Animal> c12 = new ArrayList<Animal>();
		//Collection<? super Animal> c13 = new ArrayList<Cat>();
		//Collection<? super Animal> c14 = new ArrayList<Dog>();
	}
}

class Animal {
}

class Dog extends Animal {
}

class Cat extends Animal {
}