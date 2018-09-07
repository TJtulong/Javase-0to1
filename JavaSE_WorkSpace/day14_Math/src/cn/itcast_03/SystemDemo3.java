package cn.itcast_03;

import java.util.Arrays;

/*
 * public static void arraycopy(Object src,int srcPoos,Object dest,int destPos,intLength)
 * 		从指定原数组中复制一个数组，复制从指定的位置开始，到目标数组的指定位置结束
 */
public class SystemDemo3 {
	public static void main(String[] args) {
		int[] arr = { 11, 22, 33, 44, 55 };
		int[] arr2 = { 6, 7, 8, 9, 10 };
		System.arraycopy(arr, 1, arr2, 2, 2);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));// [6, 7, 22, 33, 10]
	}
}
