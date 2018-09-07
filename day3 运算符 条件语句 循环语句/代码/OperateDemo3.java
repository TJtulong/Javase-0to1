class OperateDemo3
{
	public static void main(String[] args)
	{
		int x = 3;
		System.out.println(x>2 & x<5);
		
		int a=3, b;
		b=(a>1)?100:200;
		System.out.println("b="+b);
		
		int o=1,p=2,q=3;
		int temp=o>p?o:p;
		int max=temp>q?temp:q;
	}
}