class Fu{
	public void show(){
		System.out.println("show Fu");
	}
}

class Zi extends Fu{
	public void show(){
		System.out.println("show Zi");
	}
	public void method(){
		System.out.println("method Zi");
	}
}

class DuoTaiDemo{
	public static void main(String[] args){
		Fu f =new Zi();
		f.show();
		//f.method();找不到符号
		/*
		创建子类对象
		Zi z = new Zi();
		z.show();
		z.method();
		*/
		
		//把父的引用赋值给子的引用 强制转换
		Zi z = (Zi) f;
		z.show();
		z.method();
	}
}