/*
���ڼ̳�����һ�����󣺷�����д
����Ĺ��ܻᱻ���า�ǵ�
�������Ҫ���า�ǵ�����Ĺ��ܣ�java�ṩ�˹ؼ���final
*/

class Fu{
	public final void show(){
		System.out.println("�����޸�");
	}
}

class Zi extends Fu{
	//Zi�е�show()�޷�����Fu�е�show()
	public void show(){
		System.out.println("����һ������");
	}
}

class ZiDemo{
	public static void main(String[] args){
		Zi z = new Zi();
		z.show();
	}
}