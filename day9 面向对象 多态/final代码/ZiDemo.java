/*
由于继承中有一种现象：方法重写
父类的功能会被子类覆盖掉
如果不想要子类覆盖掉父类的功能，java提供了关键字final
*/

class Fu{
	public final void show(){
		System.out.println("不能修改");
	}
}

class Zi extends Fu{
	//Zi中的show()无法覆盖Fu中的show()
	public void show(){
		System.out.println("这是一堆垃圾");
	}
}

class ZiDemo{
	public static void main(String[] args){
		Zi z = new Zi();
		z.show();
	}
}