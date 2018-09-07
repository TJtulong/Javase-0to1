class ForForTest2
{
	/*
	九九乘法表
	*/
	public static void main(String[] args)
	{
		//转义字符\n回车 \t制表符 \b退格 \r按下回车键
		//windows系统中回车键实际是两个符号组成 \r\n
		//linux中回车符\n
		System.out.println("\"hello world\"");
		System.out.println("\\hello world\\");
		for(int x = 1;x<=9;x++)
		{
			for(int y = 1;y<=x;y++)
			{
				System.out.print(y+"*"+x+"="+y*x+"\t");
			}
			System.out.println();
		}
	}
}