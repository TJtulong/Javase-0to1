package cn.itcast_03;

import java.util.Arrays;

/*
 * public static void arraycopy(Object src,int srcPoos,Object dest,int destPos,intLength)
 * 		��ָ��ԭ�����и���һ�����飬���ƴ�ָ����λ�ÿ�ʼ����Ŀ�������ָ��λ�ý���
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
