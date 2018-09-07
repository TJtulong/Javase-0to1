class ArrayDemo{
	public static void main(String[] args){
		//定义数组
		int[] arr = {18,55,37,46,19};
		//遍历数组
		//printArray(arr);//静态只能访问静态
		//非静态方法
		//ArrayDemo ad = new ArrayDemo();
		//ad.printArray(arr);
		/*有了数组操作类的调用
		ArrayTool at = new ArrayTool();
		at.printArray(arr);
		*/
		//静态直接用类名定义
		ArrayTool.printArray(arr);
		int max = ArrayTool.getMax(arr);
		System.out.println("max="+max);
		int index = ArrayTool.getIndex(arr,55);
		System.out.println("index="+index);
	}
}