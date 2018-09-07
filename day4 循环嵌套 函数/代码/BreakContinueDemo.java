class BreakContinueDemo
{
	public static void main(String[] args)
	{
		//¸øÑ­»·±àºÅ
		first:for(int x=0;x<3;x++)
		{
			second:for(int y=0;y<4;y++)
			{
				System.out.println("x="+x);
				break first;
			}
		}
		
		for(int x=0;x<11;x++)
		{
			if(x%2==0)
			{
				continue;
			}
			System.out.println("x="+x);
		}
	}
}