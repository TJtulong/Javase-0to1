class VarDemo
{
	public static void main(String[] args)
	{
		//数据类型   变量名 = 初始化值;
		byte b=3;
		b=8;
		short s = 4000;
		int x = 12;
		long l = 12345678l; //后面加一个l表示长整形
		
		float f = 2.3f; //后面加f因为默认是double
		double d = 3.4;
		char ch = 'a';
		
		boolean bl = true;
		//必须有初始化值
		{
			int z = 9;
			System.out.println(z);  //z只在{}域有用
		}
		
		System.out.println(ch);
	}
}