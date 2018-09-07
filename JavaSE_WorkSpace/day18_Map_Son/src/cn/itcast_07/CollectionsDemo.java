package cn.itcast_07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Collections����Լ��Ͻ��в����Ĺ����࣬�Ǿ�̬����
 * 
 * Collection��Collections������
 * Collection�ǵ��м��ϵĶ���ӿڣ����ӽӿ�List��Set
 * Collections������Լ��Ͻ��в����Ĺ����࣬�жԼ��Ͻ�������Ͷ��ֲ��ҵķ���
 * 
 * ������
 * 		public static <T> void sort(List<T> list):��Ȼ����
 * 		public static <T> int binarySearch<List<?> list,T key>:���ֲ���
 * 		public static <T> T max(Collection<?> coll):���ֵ
 * 		public static <T> void reverse (List<T> list):��ת
 * 		public static <T> void shuffle(List<?> list):����û�
 */
public class CollectionsDemo {
	public static void main(String[] args) {
		// �������϶���
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
		System.out.println("list=" + list);// ����任λ��

	}
}
