class DowhileDemo
{
	public static void main(String[] args)
	{
		/*
		do
		{
			执行语句;
		}while(条件表达式);
		特点：无论条件是否满足，至少执行一次
		*/
		
		int x = 1;
		do
		{
			System.out.println("x="+x);
			x++;
		}
		while(x<3);
		
		
	}
}