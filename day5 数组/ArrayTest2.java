/*
数组元素逆序
*/
class ArrayTest2{
	public static void main(String[] args){
		int[] arr = {12,98,50,34,12};
		reverse(arr);
		reverse2(arr);
		System.out.print(arr[1]);
	}
	
	public static void reverse(int[] arr){
		for(int x = 0;x<arr.length/2;x++){
			int temp = arr[x];
			arr[x] = arr[arr.length-1-x];
			arr[arr.length-1-x] = temp;
		}
	}
	
	public static void reverse2(int[] arr){
		for(int start = 0,end=arr.length-1; start<=end;start++,end--){
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
		}
	}
}