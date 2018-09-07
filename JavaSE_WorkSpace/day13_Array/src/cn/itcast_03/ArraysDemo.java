package cn.itcast_03;

import java.util.Arrays;

/*
 * Arrays
 * 1.public static String toString(int[] a)
 * 2.public static void sort(int[] a)
 * 3.public static int binarySearch(int[] a,int key):二分查找
 */
public class ArraysDemo {
	public static void main(String[] args) {
		int[] arr = { 24, 69, 80, 57, 13 };

		// public static String toString(int[] a)
		System.out.println("排序前:" + Arrays.toString(arr));

		// public static void sort(int[] a)
		Arrays.sort(arr);//底层为快速排序
		System.out.println("排序后:" + Arrays.toString(arr));

		// public static int binarySearch(int[] a,int key)
		System.out.println("查找结果为:" + Arrays.binarySearch(arr, 57));
		System.out.println("查找结果为:" + Arrays.binarySearch(arr, 577));// -6
		//return -(low+1);
	}
}
