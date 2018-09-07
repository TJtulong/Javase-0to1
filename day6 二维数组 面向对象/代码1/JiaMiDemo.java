/*
加密问题
倒叙、加5对10取余、首位交换
*/
class JiaMiDemo{
	public static void main(String[] args){
		//难点：将数据转为数组
		int number = 123456;
		int[] arr = new int[8];
		int index = 0;
		while(number > 0){
			arr[index] = number % 10;
			index++;
			number/=10;
		}
		for(int x = 0;x<index;x++){
			arr[x]+=5;
			arr[x]%=10;
		}
		int temp = arr[0];
		arr[0] = arr[index-1];
		arr[index-1] = arr[0];
		
		for(int x = 0;x<index;x++){
			System.out.print(arr[x]);
		}
		System.out.println();
	}
}