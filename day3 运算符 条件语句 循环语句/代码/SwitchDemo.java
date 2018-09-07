class SwitchDemo
{
	public static void main(String[] args)
	{
		/*
		switch(表达式)
		{
			case 取值1:
				执行语句;
				break;
			case 取值2:
				执行语句;
				break; 
			......
			default:
				执行语句;
				break; 
		}
		*/
		int x = 1;
		switch(x) //可选择的类型byte,short,int,char
		{
			case 4:
				System.out.println("a");
				break;
			case 1:
				System.out.println("b");
				break;
			default:   //default可以放在前面但一定最后读取
				System.out.println("c");
				break; //在最后一个选项上可以省略break
		}
	}
}