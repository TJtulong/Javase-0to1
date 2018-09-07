package cn.itcast_14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*
 * 	键盘录入多个数据，以0结束，要求在控制台输出这些数据中最大值
 */
public class ArrayListDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> array = new ArrayList<Integer>();
		
		while(true) {
			System.out.println("请输入数据");
			int num=sc.nextInt();
			if(num!=0) {
				array.add(num);
			}else {
				break;
			}
		}
		
		Integer[] i = new Integer[array.size()];
		//Integer[] ii=array.toArray(i);
		array.toArray(i);
		
		Arrays.sort(i);
		System.out.println(i[i.length-1]);
	}
}
