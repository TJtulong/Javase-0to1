class FunctionDemo3
{
	public static void main(String[] args)
	{
		print99();
		
	}
	/*
	打印九九乘法表
	*/
	public static void print99()
	{
		for(int x = 1;x<=9;x++)
		{
			for(int y=1;y<=x;y++)
			{
				System.out.print(y+"*"+x+"="+x*y+"\t");
			}
			System.out.println();
		}
	}
	/*
	打印成绩等级
	*/
	public static char getLevel(int num)
	{
		char level;
		if(num>=90 && num<=100)
			level = 'A';
		else if(num>=80 && num<=89)
			level = 'B';
		else if(num>=70 && num<=79)
			level = 'C';
		else if(num>=60 && num<=69)
			level = 'D';
		else
			level = 'E';
		return level;
	}
}