class IfDemo3
{
	public static void main(String[] args)
	{
		/*
		if���ĵ����ָ�ʽ��
		if(�������ʽ)
		{
			ִ����䣻
		}
		else if(�������ʽ)
		{
			ִ�����;
		}
		else
		{
			ִ�����;
		}
		*/
		int x = 3;
		if(x>1)
			System.out.println("a");
		else if(x>2)
		{
			System.out.println("b");
			int k=8;
		}
		else
			System.out.println("c");
		//System.out.println("over"+k);
	}
}