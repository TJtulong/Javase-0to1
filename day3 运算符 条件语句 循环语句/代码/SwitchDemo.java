class SwitchDemo
{
	public static void main(String[] args)
	{
		/*
		switch(���ʽ)
		{
			case ȡֵ1:
				ִ�����;
				break;
			case ȡֵ2:
				ִ�����;
				break; 
			......
			default:
				ִ�����;
				break; 
		}
		*/
		int x = 1;
		switch(x) //��ѡ�������byte,short,int,char
		{
			case 4:
				System.out.println("a");
				break;
			case 1:
				System.out.println("b");
				break;
			default:   //default���Է���ǰ�浫һ������ȡ
				System.out.println("c");
				break; //�����һ��ѡ���Ͽ���ʡ��break
		}
	}
}