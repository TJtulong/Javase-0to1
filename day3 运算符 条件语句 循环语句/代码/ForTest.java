class ForTest
{
	public static void main(String[] args)
	{		
		int sum=0;
		for(int x = 1; x<10; x++)
		{
			sum+=x;
		}
		System.out.println("sum="+sum);
		
		/*
		for和while的特点：
		1.for和while可以互换
		2.格式上不同，在使用上有小区别
		如果需要通过变量来对循环进行控制，该变量只作为循环增量
		存在时，区别就体现出来了
		*/
		
		for(int y = 1;y<5;y++)
		{
			System.out.println(y);
		}
		//System.out.println(y) 无法编译通过因为y在for结束后删除
		
		//无限循环最简单形式
		//  while(true){}
		//  for(;;){}
	}
}