class ForForTest2
{
	/*
	�žų˷���
	*/
	public static void main(String[] args)
	{
		//ת���ַ�\n�س� \t�Ʊ�� \b�˸� \r���»س���
		//windowsϵͳ�лس���ʵ��������������� \r\n
		//linux�лس���\n
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