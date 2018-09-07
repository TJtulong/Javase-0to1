//教练与运动员案例

//定义一个说英语接口
interface SpeakEnglish{
	public abstract void speak();
}

//定义一个抽象类
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
		System.out.println("睡觉");
	}
	public abstract void eat();
}

//定义运动员抽象类
abstract class Player extends Person{
	public Player(){}
	public Player(String name,int age){
		super(name,age);
	}
	public abstract void study();
}

//定义教练抽象类
abstract class Coach extends Person{
	public Coach(){}
	public Coach(String name,int age){
		super(name,age);
	}
	public abstract void teach();
}

//定义乒乓球运动员具体类
class PingPangPlayer extends Player implements SpeakEnglish{
	public PingPangPlayer(){}
	public PingPangPlayer(String name,int age){
		super(name,age);
	}
	public void eat(){
		System.out.println("喝粥");
	}
	public void study(){
		System.out.println("打乒乓球");
	}
	public void speak(){
		System.out.println("说英语");
	}
}

//定义篮球运动员具体类
class BasketballPlayer extends Player{
	public BasketballPlayer(){}
	public BasketballPlayer(String name,int age){
		super(name,age);
	}
	public void eat(){
		System.out.println("喝牛奶");
	}
	public void study(){
		System.out.println("打篮球");
	}
}

//定义乒乓球教练具体类
class PingPangCoach extends Coach implements SpeakEnglish{
	public PingPangCoach(){}
	public PingPangCoach(String name,int age){
		super(name,age);
	}
	public void eat(){
		System.out.println("喝大米粥");
	}
	public void teach(){
		System.out.println("教打乒乓球");
	}
	public void speak(){
		System.out.println("说英语");
	}
}

//定义篮球教练具体类
class BasketballCoach extends Coach{
	public BasketballCoach(){}
	public BasketballCoach(String name,int age){
		super(name,age);
	}
	public void eat(){
		System.out.println("吃肉");
	}
	public void teach(){
		System.out.println("教打篮球");
	}
}

class InterfaceDemo{
	public static void main(String[] args){
		PingPangPlayer pp = new PingPangPlayer("王若潇",22);
		System.out.println(pp.getName()+"----"+pp.getAge());
		pp.eat();
		pp.study();
		pp.sleep();
		pp.speak();
	}
}