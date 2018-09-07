class ForForTest
{
	public static void main(String[] args)
	{
		/*
		*****
		****
		***
		**
		*
		*/
		
		for(int x=0;x<5;x++)
		{
			for(int y=0;y<5-x;y++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		/*
		*
		**
		***
		****
		*****
		*/
		for(int x=0;x<5;x++)
		{
			for(int y=0;y<x+1;y++)
				System.out.print("*");
			System.out.println();
		}
		
		/*
		54321
		5432
		543
		54
		5
		*/
		for(int x = 0;x<5;x++)
		{
			for(int y=0;y<5-x;y++)
				System.out.print(5-y);
			System.out.println();
		}
		
	}
}