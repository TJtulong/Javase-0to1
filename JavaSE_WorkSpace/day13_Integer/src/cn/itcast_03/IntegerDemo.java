package cn.itcast_03;

/*
 * ʮ����ת��Ϊ��������
 * public static String toString(int i,int radix)
 * �������Ƶ�ʮ����
 * public static int parseInt(String s,int radix)
 */
public class IntegerDemo {
	public static void main(String[] args) {
		System.out.println(Integer.toString(100, 5));// �����
		System.out.println(Integer.toString(100, 7));// �߽���
		System.out.println(Integer.toString(100, -7));// ���Ʋ���Ϊ��
		// ���Ƶķ�Χ-->2~36 0-9+a-z��36��

		// �������Ƶ�ʮ����
		System.out.println(Integer.parseInt("100", 10));
		System.out.println(Integer.parseInt("100", 2));
		System.out.println(Integer.parseInt("100", 8));
	}
}
