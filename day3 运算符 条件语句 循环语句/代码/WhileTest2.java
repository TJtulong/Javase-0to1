class WhileTest2
{
	public static void main(String[] args)
	{
		/*
		100以内6的倍数出现次数
		*/
		//计数器思想
		int num = 0, i = 1;
		while(i<100)
		{
			if(i%6==0)
				num++;
			i++;
		}
		System.out.println("次数为"+num);
	}
}