class ArrayDemo5{
	public static void main(String[] args){
		//数组遍历
		int[] arr = {11,22,33,44,55};
		//数组名结合索引
		for(int x = 0;x<5;x++){
			System.out.println(arr[x]);
		}
		
		int[] arr2 = {3,4,5,6,7,5,4,5,4,6,4,6,4,6,4,4,5,6,7,67,7,8,7,5,45,3,6};
		//length专门获取数组的长度
		//格式：数组名.length 返回数组的长度
		System.out.println(arr2.length);
		for(int x = 0;x<arr2.length;x++){
			System.out.println(arr2[x]);
		}	
		printArray(arr);
	}
	//遍历数组的方法：void 数组
	public static void printArray(int[] arr){
		for(int x = 0;x<arr.length;x++){
			if(x==arr.length-1){
				System.out.println(arr[x]);
			}
			else{
				System.out.print(arr[x]+",");
			}
		}
	}
}