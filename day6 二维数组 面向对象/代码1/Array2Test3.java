//打印杨辉三角形
import java.util.Scanner;
class Array2Test3{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入行数：");
		int n = sc.nextInt();
		int[][] arr = new int[n][n];
		for(int x = 0;x<arr.length;x++){
			arr[x][0] = 1;
			arr[x][x] = 1;//任何一行的最后一列
		}
		for(int x = 2;x<arr.length;x++){
			for(int y = 1;y<x;y++){
				arr[x][y] = arr[x-1][y-1] + arr[x-1][y];
			}
		}
		
		//遍历数组
		for(int x = 0;x<arr.length;x++){
			for(int y = 0;y<=x;y++){
				System.out.print(arr[x][y]+"\t");
			}
			System.out.println();
		}
	}
}