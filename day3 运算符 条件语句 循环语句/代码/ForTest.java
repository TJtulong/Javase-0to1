class ForTest
{
	public static void main(String[] args)
	{		
		int sum=0;
		for(int x = 1; x<10; x++)
		{
			sum+=x;
		}
		System.out.println("sum="+sum);
		
		/*
		for��while���ص㣺
		1.for��while���Ի���
		2.��ʽ�ϲ�ͬ����ʹ������С����
		�����Ҫͨ����������ѭ�����п��ƣ��ñ���ֻ��Ϊѭ������
		����ʱ����������ֳ�����
		*/
		
		for(int y = 1;y<5;y++)
		{
			System.out.println(y);
		}
		//System.out.println(y) �޷�����ͨ����Ϊy��for������ɾ��
		
		//����ѭ�������ʽ
		//  while(true){}
		//  for(;;){}
	}
}