class SwitchTest
{
	public static void main(String[] args)
	{
		/*
		用户输入的数据对应出季节
		*/
		int month = 5;
		switch(month)
		{
			case 3:
			case 4:
			case 5:
				System.out.println(month+"对应的是春季");
				break;
			case 6:
			case 7:
			case 8:
				System.out.println(month+"对应的是夏季");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println(month+"对应的是秋季");
				break;
			case 12:
			case 1:
			case 2:
				System.out.println(month+"对应的是冬季");
				break;
			default:
				System.out.println("没有对应的季节");
		}
	}
}