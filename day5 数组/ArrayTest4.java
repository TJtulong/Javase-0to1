class ArrayTest4{
	public static void main(String[] args){
		//数组元素查找
		int[] arr = {200,250,38,23,463,652,34};
		int index = getIndex2(arr,463);
		System.out.println(index);
	}
	public static int getIndex(int[] arr,int value){
		for(int x = 0;x<arr.length;x++){
			if(arr[x]== value){
				return x;
			}
		}
		return -1;
	}
	public static int getIndex2(int[] arr,int value){
		int index = -1;
		for(int x = 0;x<arr.length;x++){
			if(arr[x]== value){
				index = x;
				break;
			}
		}
		return index;
	}
}