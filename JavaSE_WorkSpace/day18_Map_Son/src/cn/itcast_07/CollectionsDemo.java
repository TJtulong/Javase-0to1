package cn.itcast_07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Collections是针对集合进行操作的工具类，是静态方法
 * 
 * Collection与Collections的区别：
 * Collection是单列集合的顶层接口，有子接口List和Set
 * Collections：是针对集合进行操作的工具类，有对集合进行排序和二分查找的方法
 * 
 * 方法：
 * 		public static <T> void sort(List<T> list):自然排序
 * 		public static <T> int binarySearch<List<?> list,T key>:二分查找
 * 		public static <T> T max(Collection<?> coll):最大值
 * 		public static <T> void reverse (List<T> list):反转
 * 		public static <T> void shuffle(List<?> list):随机置换
 */
public class CollectionsDemo {
	public static void main(String[] args) {
		// 创建集合对象
		List<Integer> list = new ArrayList<Integer>();

		list.add(30);
		list.add(20);
		list.add(50);
		list.add(10);
		list.add(40);

		System.out.println("list=" + list);// list=[30, 20, 50, 10, 40]
		// public static <T> void sort(List<T> list)
		Collections.sort(list);
		System.out.println("list=" + list);// list=[10, 20, 30, 40, 50]

		// public static <T> int binarySearch<List<?> list,T key>
		System.out.println("binarySearch=" + Collections.binarySearch(list, 30));// 2
		System.out.println("binarySearch=" + Collections.binarySearch(list, 300));// -6

		// public static <T> T max(Collection<?> coll)
		System.out.println("max=" + Collections.max(list));// max=50

		// public static <T> void reverse (List<T> list)
		Collections.reverse(list);
		System.out.println("list=" + list);// list=[50, 40, 30, 20, 10]

		// public static <T> void shuffle(List<?> list)
		Collections.shuffle(list);
		System.out.println("list=" + list);// 随机变换位置

	}
}
