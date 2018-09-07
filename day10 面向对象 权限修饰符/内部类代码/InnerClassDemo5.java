/*
匿名内部类：内部类的简化写法
前提：存在一个类或接口
格式：new 类名或接口名(){
	方法重写；
}
本质是继承了该类或实现了该接口的子类匿名对象
*/
interface Inter{
	public abstract void show();
	public abstract void show2();
}

class Outer{
	public void method(){
		/*
		一个方法的时候
		new Inter(){
			public void show(){
				System.out.println("show");
			}
		}.show();
		*/
		
		//两个方法的时候
		Inter i = new Inter(){ //多态
			public void show(){
				System.out.println("show");
			}
			public void show2(){
				System.out.println("show2");
			}
		};
		i.show();
		i.show2();
	}
}

class InnerClassDemo5{
	public static void main(String[] args){
		Outer o = new Outer();
		o.method();
	}
}