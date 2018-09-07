class ArrayTest1{
	public static void main(String[] args){
		int[] arr = {34,98,10,25,67};
		//获取数组最大值
		int max = arr[0];
		for(int x = 1;x<arr.length;x++){
			if(arr[x] > max){
				max = arr[x];
			}
		}
		System.out.println(max);
	}
}