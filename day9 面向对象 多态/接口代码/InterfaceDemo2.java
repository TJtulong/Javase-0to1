/*
	接口成员变量特点：
	成员变量：只能是常量，并且是静态。有默认修饰符 public static final
	构造方法：接口没有构造方法（所有类都继承自一个类object）
	成员方法：只能是抽象方法，默认为public abstract
	
*/

interface Inter{
	public int num = 10;
	public final int num2 = 20;
	//public Inter(){}
	void show();//默认为public abstract
}

//接口名+Impl这种格式是接口的实现类格式
class InterImpl extends Object implements Inter{
	public InterImpl(){
		super();
	}
	public void show(){};
}

class InterfaceDemo2{
	public static void main(String[] args){
		Inter i = new InterImpl();
		System.out.println(i.num);//10
		System.out.println(i.num2);//20
		//i.num = 100;
		//i.num2 = 200;不能修改（final）
		//System.out.println(i.num);
		//System.out.println(i.num2;
		System.out.println(Inter.num);
		System.out.println(InterImpl.num2);//10 默认是静态
		System.out.println("----------");//20
	}
}