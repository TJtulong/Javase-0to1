package cn.itcast_03;

import java.util.Arrays;

/*
 * Arrays
 * 1.public static String toString(int[] a)
 * 2.public static void sort(int[] a)
 * 3.public static int binarySearch(int[] a,int key):���ֲ���
 */
public class ArraysDemo {
	public static void main(String[] args) {
		int[] arr = { 24, 69, 80, 57, 13 };

		// public static String toString(int[] a)
		System.out.println("����ǰ:" + Arrays.toString(arr));

		// public static void sort(int[] a)
		Arrays.sort(arr);//�ײ�Ϊ��������
		System.out.println("�����:" + Arrays.toString(arr));

		// public static int binarySearch(int[] a,int key)
		System.out.println("���ҽ��Ϊ:" + Arrays.binarySearch(arr, 57));
		System.out.println("���ҽ��Ϊ:" + Arrays.binarySearch(arr, 577));// -6
		//return -(low+1);
	}
}
