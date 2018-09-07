class Array2Test2{
	public static void main(String[] args){
		int[][] arr = {{22,66,44},{77,88,32},{34,76,23},{12,45,75}};
		int sum = 0;
		for(int x = 0;x<arr.length;x++){
			for(int y=0;y<arr[x].length;y++){
				sum += arr[x][y];
			}
		}
		System.out.println(sum);
	}
}