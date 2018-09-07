class FunctionDemo
{
	public static void main(String[] args)
	{
		int c = add(3,4);
		System.out.println("c="+c);
		myprint();
	}
	/*
	定义函数的格式：
	修饰符 返回值类型 函数名（参数类型：参数1, 参数类型：参数2）
	{
		执行语句;
		return 返回值; //return 可以用来结束函数
	}
	
	特殊情况：功能没有具体返回值
	这时reutrn的后面直接用分号结束，关键字是void
	注意：如果返回值类型为void，return语句可以省略不写
	***不要在函数中定义函数
	*/
	
	public static void myprint()
	{
		System.out.println("hello java");
		int c =9;
		//return ;
	}
	static int add(int a,int b)
	{
		return a+b;
	}
	/*
	public static void add(int a, int b)
	{
		System.out.println(a+b);
	}
	该方法不好，只需运算即可，没有必要输出
	*/
}