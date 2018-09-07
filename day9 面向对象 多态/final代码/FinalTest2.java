class Demo{
	int num;
	final int num2;
	{
		//num2 = 10;
	}
	public Demo(){
		num = 100;
		num2 = 200;
	}
}

class FinalTest2{
	public static void main(String[] args){
		Demo d = new Demo();
	}
}