package cn.itcast_01;

import java.util.ArrayList;
import java.util.List;

/*
 * JDK5�������ԣ��Զ���װ�䡢���͡���ǿfor����̬���롢�ɱ������ö��
 * 	��ǿfor��forѭ����һ��
 * 		for(Ԫ���������� ����:�������Collection����){}
 * 
 * 	�ô�����������ͼ��ϵı���
 * 	�׶ˣ���ǿfor��Ŀ�겻��Ϊnull
 * 			�Ƚ��в�Ϊnull���ж�
 * 	��ǿfor��ʵ���Ǵ����������
 */
public class ForDemo {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		for (int x = 0; x < arr.length; x++) {
			System.out.println(arr[x]);
		}
		System.out.println("-----------");

		// ��ǿfor
		for (int x : arr) {
			System.out.println(x);
		}
		System.out.println("-----------");

		ArrayList<String> array = new ArrayList<>();
		array.add("hello");
		array.add("world");
		array.add("java");

		for (String s : array) {
			System.out.println(s);
		}

		List<String> list = null;
		if (list != null) {
			for (String s : list) {
				System.out.println(s);
			} // NullPointerException
		}
	}
}
