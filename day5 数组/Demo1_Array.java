class Demo1_Array
{
	public static void main(String[] args)
	{
		//数据类型[] 数组名=new 数据类型[数组长度];
		int[] arr = new int[5];  //可以存储5个int类型数据
		//动态初始化，在内存中连续开辟5块空间
		arr[0]=10;
		System.out.println(arr[0]);
		
		/*
		int:数据类型
		[]：代表数组
		arr：合法的标识符
		new：创建新的实体或对象
		int：数据类型
		5：代表数组长度
		*/
	}
}