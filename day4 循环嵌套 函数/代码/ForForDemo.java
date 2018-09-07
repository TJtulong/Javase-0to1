class ForForDemo
{
	public static void main(String[] args)
	{
		//大圈套小圈
		/*
		for(int x = 0;x<3;x++)
		{
			for(int y=0;y<4;y++)
			{
				System.out.println("ok");
			}			
		}
		*/
		
		/*
		输出
		*****
		*****
		*****
		*****
		*/
		
		for(int x = 0;x<4;x++)
		{
			for(int y = 0;y<5;y++)
			{
				System.out.print("*");
			}
			System.out.println(); //换行
		}
	}
}