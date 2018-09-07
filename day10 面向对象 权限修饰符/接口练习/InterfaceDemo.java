//�������˶�Ա����

//����һ��˵Ӣ��ӿ�
interface SpeakEnglish{
	public abstract void speak();
}

//����һ��������
abstract class Person{
	private String name;
	private int age;
	public Person(){}
	public Person(String name,int age){
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
	public void sleep(){
		System.out.println("˯��");
	}
	public abstract void eat();
}

//�����˶�Ա������
abstract class Player extends Person{
	public Player(){}
	public Player(String name,int age){
		super(name,age);
	}
	public abstract void study();
}

//�������������
abstract class Coach extends Person{
	public Coach(){}
	public Coach(String name,int age){
		super(name,age);
	}
	public abstract void teach();
}

//����ƹ�����˶�Ա������
class PingPangPlayer extends Player implements SpeakEnglish{
	public PingPangPlayer(){}
	public PingPangPlayer(String name,int age){
		super(name,age);
	}
	public void eat(){
		System.out.println("����");
	}
	public void study(){
		System.out.println("��ƹ����");
	}
	public void speak(){
		System.out.println("˵Ӣ��");
	}
}

//���������˶�Ա������
class BasketballPlayer extends Player{
	public BasketballPlayer(){}
	public BasketballPlayer(String name,int age){
		super(name,age);
	}
	public void eat(){
		System.out.println("��ţ��");
	}
	public void study(){
		System.out.println("������");
	}
}

//����ƹ�������������
class PingPangCoach extends Coach implements SpeakEnglish{
	public PingPangCoach(){}
	public PingPangCoach(String name,int age){
		super(name,age);
	}
	public void eat(){
		System.out.println("�ȴ�����");
	}
	public void teach(){
		System.out.println("�̴�ƹ����");
	}
	public void speak(){
		System.out.println("˵Ӣ��");
	}
}

//�����������������
class BasketballCoach extends Coach{
	public BasketballCoach(){}
	public BasketballCoach(String name,int age){
		super(name,age);
	}
	public void eat(){
		System.out.println("����");
	}
	public void teach(){
		System.out.println("�̴�����");
	}
}

class InterfaceDemo{
	public static void main(String[] args){
		PingPangPlayer pp = new PingPangPlayer("������",22);
		System.out.println(pp.getName()+"----"+pp.getAge());
		pp.eat();
		pp.study();
		pp.sleep();
		pp.speak();
	}
}