//final class Fu  �޷�������Fu���м̳�
class Fu{
	public int num = 10;
	public final int num2 = 20;
}

class Zi extends Fu{
	//Zi�е�show()�޷�����Fu�е�show()
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