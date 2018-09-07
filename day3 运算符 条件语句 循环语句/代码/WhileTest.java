class WhileTest
{
	public static void main(String[] args)
	{
		/*
		练习：
		获取1到10 10个数的和
		*/
		
		//累加算法
		int i = 1, n=0;
		while(i<11) 
		{
			n=n+i;
			i++;
		}
		System.out.println("n="+n);
	}
}