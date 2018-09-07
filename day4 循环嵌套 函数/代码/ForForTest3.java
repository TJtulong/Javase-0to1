class ForForTest3
{
	public static void main(String[] args)
	{
		/*
		* * * * *
		 * * * *
		  * * *
		   * *
		    *
		*/
		for(int x=1;x<=5;x++)
		{
			for(int y=0;y<x;y++)
			{
				System.out.print(" ");
			}
			for(int y=0;y<=5-x;y++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}