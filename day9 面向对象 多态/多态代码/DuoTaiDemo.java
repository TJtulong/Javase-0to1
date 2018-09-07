/*
多态中的成员访问特点：
1.成员变量：编译看左边，运行看左边
2.构造方法：创建子类对象时，访问父类的构造方法，对父类的数据进行初始化
3.成员方法：编译看左边，运行看右边
4.静态方法;编译看左边，运行看左边(静态与类相关，算不上重写)
由于成员方法存在重写，因此运行看右边
*/
class Fu{
	public int num =100;
	public void show(){
		System.out.println("show Fu");
	}
	public static void function(){
		System.out.println("function Fu");
	}
}

class Zi extends Fu{
	public int num = 1000;
	public int num2 = 200;
	//方法重写
	public void show(){
		System.out.println("show Zi");
	}
	public void method(){
		System.out.println("method Zi");
	}
	public static void function(){
		System.out.println("function Zi");
	}
}

class DuoTaiDemo{
	public static void main(String[] args){
		Fu f =new Zi();
		System.out.println(f.num);
		//System.out.println(f.num2);找不到符号
		f.show();
		//f.method();找不到符号
		f.function();
	}
}