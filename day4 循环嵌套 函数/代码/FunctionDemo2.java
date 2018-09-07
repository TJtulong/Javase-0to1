class FunctionDemo2
{
	public static void main(String[] args)
	{
		draw(4,6);
		draw(7,9);
	}
	/*
	需求1：定义一个功能，完成两个数和的获取
	思路：既然定义功能，就可以用函数来实现
	通过两个明确来完成
	明确一：这个功能的结果是什么？ int
	明确二：这个功能实现过程中是否需要未知内容参与运算？ 加数和被加数（参数列表）
	注意：返回值类型与参数类型没有关系
	*/
	public static int add(int a,int b)
	{
		return(a+b);
	}
	/*
	需求2：画一个矩形在控制台
	*/
	public static void draw(int row, int col)
	{
		for(int x=1;x<=row;x++)
		{
			for(int y = 1;y<col;y++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	/*
	需求3：比较两个数是否相等
	*/
	public static boolean equals(int a, int b)
	{
		/*
		if(a==b)
			return true;
		return false;
		*/
		//return(a==b)?true:false;
		return a==b;
	}
	/*
	需求4：定义一个功能，获取两数中较大数
	*/
	public static int getMax(int a,int b)
	{
		return a>b?a:b;
	}
}