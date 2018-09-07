//final class Fu  无法从最终Fu进行继承
class Fu{
	public int num = 10;
	public final int num2 = 20;
}

class Zi extends Fu{
	//Zi中的show()无法覆盖Fu中的show()
	public void show(){
		num = 100;
		//num2 = 200
		System.out.println(num);
		System.out.println(num2);
		
	}
}

class FinalDemo{
	public static void main(String[] args){
		Zi z = new Zi();
		z.show();
	}
}