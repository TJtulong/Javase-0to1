class FunctionDemo4
{
	public static void main(String[] args)
	{
		double x=add(1.1,2.2);
		int y=add(1,2);
		int z=add(1,2,3);
		System.out.println(x);
	}
	/*
	����������
	���������뷵��ֵ�����޹�
	java���Ͻ�������
	*/
	//�ӷ����㣺���������ĺ�
	public static int add(int a,int b)
	{
		return a+b;
	}
	//�ӷ����㣺����С���ĺ�
	public static double add(double a,double b)
	{
		return a+b;
	}
	//�ӷ����㣺���������ĺ�
	public static int add(int a,int b,int c)
	{
		return a+b+c;
	}
	
	public static void print99(int num)
	{
		for(int x=1; x<=num; x++)
		{
			for(int y=1; y<=x; y++)
			{
				System.out.print(y+"*"+x+"="+y*x+"\t");
			}
			System.out.println();
		}
	}

	//��ӡ99�˷���
	public static void print99()
	{
		print99(9);
	}
}