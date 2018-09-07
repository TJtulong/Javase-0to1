class VarDemo2
{
	public static void main(String[] args)
	{
		int x = 3;
		x = x + 5; //运算区运算（同类型）
		//运算两端不同类型不能运算（数值型除外）
		byte b = 5;
		x = x + b;
		
		byte c = 3;
		c = (byte)(c + 4); //强制类型转换
		
		System.out.println('你'+0);
		int x3;
		int x1=Integer.MAX_VALUE;
		int x2=98;
		x3 = x1 + x2;
		System.out.println(x3);
			
		}
}