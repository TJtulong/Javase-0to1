class FunctionDemo
{
	public static void main(String[] args)
	{
		int c = add(3,4);
		System.out.println("c="+c);
		myprint();
	}
	/*
	���庯���ĸ�ʽ��
	���η� ����ֵ���� ���������������ͣ�����1, �������ͣ�����2��
	{
		ִ�����;
		return ����ֵ; //return ����������������
	}
	
	�������������û�о��巵��ֵ
	��ʱreutrn�ĺ���ֱ���÷ֺŽ������ؼ�����void
	ע�⣺�������ֵ����Ϊvoid��return������ʡ�Բ�д
	***��Ҫ�ں����ж��庯��
	*/
	
	public static void myprint()
	{
		System.out.println("hello java");
		int c =9;
		//return ;
	}
	static int add(int a,int b)
	{
		return a+b;
	}
	/*
	public static void add(int a, int b)
	{
		System.out.println(a+b);
	}
	�÷������ã�ֻ�����㼴�ɣ�û�б�Ҫ���
	*/
}