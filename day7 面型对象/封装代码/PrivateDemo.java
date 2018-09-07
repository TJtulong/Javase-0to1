class Demo{
	private int num = 10;
	public void show(){
		System.out.println(num);
	}
	private void method(){
		System.out.println("method");
	}
	public  void function(){
		method();
	}
}

class PrivateDemo{
	public static void main(String[] args){
		Demo d = new Demo();
		d.show();//访问私有成员变量方法
		d.function();//访问私有方法
	}
}