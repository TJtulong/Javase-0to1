class OperateDemo
{
	public static void main(String[] args)
	{
		//算术运算符
		int x = 6370;
		x = x / 1000 * 1000;
		System.out.println(x);
		int a = 4,b = 5;
		System.out.println("a="+a+",b="+b); //a=4,b=5
		
		a = 3;
		b = a++;
		System.out.println(a+","+b);
		
		int i = 3;
		i = i++;
		System.out.println("i="+i);
		
		//赋值运算符
		int a1,a2,a3;
		a1=a2=a3=4;
		a1+=2;//a1=a1+2
	}
}