/*
格式2
数据类型[][] 数组名 = new 数据类型[m][]
可以动态给出列数
*/
class Array2Demo2{
	public static void main(String[] args){
		int[][] arr = new int[3][];
		System.out.println(arr); //地址值
		System.out.println(arr[0]); //null
		
		//动态地为每一个一维数组分配空间
		arr[0] = new int[2];
		arr[1] = new int[3];
		arr[2] = new int[4];
		System.out.println(arr[0]); //地址值
		System.out.println(arr[0][0]); //0
		
		arr[1][0] = 1;//二维数组元素
	}
}