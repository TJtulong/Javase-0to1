/*
������ĳ�Ա�ص㣺
	��Ա�������ȿ����Ǳ�����Ҳ�����ǳ���
	���췽�����У�����������ʸ������ݵĳ�ʼ��
	��Ա�������ȿ����ǳ���ģ�Ҳ�����Ƿǳ����
���󷽷����ԣ�1.���󷽷���ǿ������������
			  2.�ǳ��󷽷�������̳е����飬��ߴ��븴����
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