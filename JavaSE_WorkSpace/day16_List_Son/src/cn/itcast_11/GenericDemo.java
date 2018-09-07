package cn.itcast_11;

/*
 * 	ͨ�����
 * 	?���������ͣ����û����ȷ����ô����Object������java��
 * 	? extends E:�����޶���E��������
 *  ? super E:�����޶���E���丸��
 */
import java.util.ArrayList;
import java.util.Collection;

public class GenericDemo {
	public static void main(String[] args) {
		// ���������ȷд��ʱ��ǰ�����һ��
		Collection<Object> c = new ArrayList<Object>();
		// Collection<Object> c2=new ArrayList<Animal>();

		// ?��ʾ�������Ͷ��ǿ��Ե�
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