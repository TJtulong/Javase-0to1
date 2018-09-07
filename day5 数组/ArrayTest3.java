/*
数组查表法
*/
import java.util.Scanner;
class ArrayTest3{
	public static void main(String[] args){
		String[] strArray = {"星期一","星期二","星期三","星期四","星期五","星期六","星期日"};
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个数字（0~6）");
		int index = sc.nextInt();
		System.out.println("你查找的是："+strArray[index]);
	}
}