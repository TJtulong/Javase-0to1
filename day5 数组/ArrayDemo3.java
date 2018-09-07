class ArrayDemo3{
	public static void main(String[] args){
		int[] arr=new int[3];
		arr[0]=88;
		arr[1]=33;
		arr[2]=66;
		
		int[] arr2=new int[3];
		arr[0]=22;
		arr[1]=44;
		arr[2]=55;
		
		//定义第三个数组，把第三个元素地址值赋值给它
		int[] arr3 = arr;
		arr3[0] = 100;
		arr3[1] = 200;
		System.out.println(arr[0]);
		System.out.println(arr[1]);
	}
}
