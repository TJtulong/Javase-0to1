/*
实现键盘数据的录入
A.导包
import java.util.Scanner;//(在class上面)
B.创建键盘录入对象
Scanner sc = new Scanner(System.in);
C.通过对象获取数据
int x = sc.nextInt();
*/
import java.util.Scanner;
class ScannerDemo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个数据：");
		int x = sc.nextInt();
		System.out.println("你输入的是："+x);
	}
}