class SwitchTest
{
	public static void main(String[] args)
	{
		/*
		�û���������ݶ�Ӧ������
		*/
		int month = 5;
		switch(month)
		{
			case 3:
			case 4:
			case 5:
				System.out.println(month+"��Ӧ���Ǵ���");
				break;
			case 6:
			case 7:
			case 8:
				System.out.println(month+"��Ӧ�����ļ�");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println(month+"��Ӧ�����＾");
				break;
			case 12:
			case 1:
			case 2:
				System.out.println(month+"��Ӧ���Ƕ���");
				break;
			default:
				System.out.println("û�ж�Ӧ�ļ���");
		}
	}
}