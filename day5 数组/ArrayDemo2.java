/*
定义一个数组，输出该数组的名称和数组元素值
给数组赋值，再输出该数组的名称和数组元素值
*/
class ArrayDemo2{
	public static void main(String[] args){
		int[] arr=new int[3];
		System.out.println(arr);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		arr[0]=100;
		arr[2]=200;
		System.out.println(arr);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
	}
}