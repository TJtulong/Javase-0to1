class IfDemo3
{
	public static void main(String[] args)
	{
		/*
		if语句的第三种格式：
		if(条件表达式)
		{
			执行语句；
		}
		else if(条件表达式)
		{
			执行语句;
		}
		else
		{
			执行语句;
		}
		*/
		int x = 3;
		if(x>1)
			System.out.println("a");
		else if(x>2)
		{
			System.out.println("b");
			int k=8;
		}
		else
			System.out.println("c");
		//System.out.println("over"+k);
	}
}