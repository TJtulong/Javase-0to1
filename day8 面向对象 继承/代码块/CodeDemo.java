class Code{
	//��̬�����
	static{
		int a = 1000;
		System.out.println(a);
	}
	//��������
	{
		int x = 100;
		System.out.println(x);
	}
	//���췽��
	public Code(){}
	//���췽��
	public Code(int a){
		System.out.println("code");
	}
	//��������
	{
		int x = 200;
		System.out.println(x);
	}
	//��̬�����
	static{
		int b = 2000;
		System.out.println(b);
	}
}

class CodeDemo{
	public static void main(String[] args){
		{
			int x = 10;
			System.out.println(x);
		}
		//System.out.println(x);
		System.out.println("------------");
		Code c = new Code();
		Code c1 = new Code(2);
	}
}
/*
10
------------
1000
2000
100
200
100
200
code
*/