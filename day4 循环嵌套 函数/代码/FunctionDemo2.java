class FunctionDemo2
{
	public static void main(String[] args)
	{
		draw(4,6);
		draw(7,9);
	}
	/*
	����1������һ�����ܣ�����������͵Ļ�ȡ
	˼·����Ȼ���幦�ܣ��Ϳ����ú�����ʵ��
	ͨ��������ȷ�����
	��ȷһ��������ܵĽ����ʲô�� int
	��ȷ�����������ʵ�ֹ������Ƿ���Ҫδ֪���ݲ������㣿 �����ͱ������������б�
	ע�⣺����ֵ�������������û�й�ϵ
	*/
	public static int add(int a,int b)
	{
		return(a+b);
	}
	/*
	����2����һ�������ڿ���̨
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
	����3���Ƚ��������Ƿ����
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
	����4������һ�����ܣ���ȡ�����нϴ���
	*/
	public static int getMax(int a,int b)
	{
		return a>b?a:b;
	}
}