package cn.itcast_02;

/*
 * 	��̬���룺import static ����...����.������
 * 		��ֱ�ӵ��뷽���ļ���
 * 	ע�����
 * 			1.�����Ǿ�̬��
 * 			2.���ͬ�������������ǰ׺
 */
import static java.lang.Math.abs;
import static java.lang.Math.pow;
import static java.lang.Math.max;

public class StaticImportDemo {
	public static void main(String[] args) {
		System.out.println(java.lang.Math.abs(-100));
		System.out.println(java.lang.Math.pow(2, 3));
		System.out.println(java.lang.Math.max(10, 20));

		// ̫���ӣ�����import
		System.out.println(Math.abs(-100));
		System.out.println(Math.pow(2, 3));
		System.out.println(Math.max(10, 20));

		//
		System.out.println(abs(-100));
		System.out.println(pow(2, 3));
		System.out.println(max(10, 20));

	}
}
