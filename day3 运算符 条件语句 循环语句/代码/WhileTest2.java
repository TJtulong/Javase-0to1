class WhileTest2
{
	public static void main(String[] args)
	{
		/*
		100����6�ı������ִ���
		*/
		//������˼��
		int num = 0, i = 1;
		while(i<100)
		{
			if(i%6==0)
				num++;
			i++;
		}
		System.out.println("����Ϊ"+num);
	}
}