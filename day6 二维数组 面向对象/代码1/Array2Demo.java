class Array2Demo{
	public static void main(String[] args){
		int[][] arr = new int[3][2];
		System.out.println(arr);//地址值 [[I@15db9742
		System.out.println(arr[0]);//地址值 [I@6d06d69c
		System.out.println(arr[1]);//地址值 [I@7852e922
		System.out.println(arr[2]);//地址值 [I@4e25154f
		System.out.println(arr[0][0]);//0
		System.out.println(arr[1][1]);//0
	}
}