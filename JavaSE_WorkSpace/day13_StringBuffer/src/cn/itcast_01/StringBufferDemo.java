package cn.itcast_01;

/*
 * 	�̰߳�ȫ�����̣߳�
 * 	��ȫ--ͬ��--�����ǰ�ȫ��
 * 	����ȫ--��ͬ��--Ч�ʸ�һЩ
 * 	��ȫ��Ч������
 * 
 * 	StringBuffer�Ĺ��췽��:
 * 		public StringBuffer():�޲ι���
 * 		public StringBuffer(int capacity):ָ���������ַ����������
 * 		public StringBuffer(String str):ָ�����ݵ��ַ����������
 * 
 * 	StringBuffer�ķ���:
 * 		public int capacity()�����ص�ǰ����/����ֵ
 * 		public int length()�����س���/ʵ��ֵ
 */
public class StringBufferDemo {
	public static void main(String[] args) {
		// public StringBuffer() ��Ϊ����
		StringBuffer sb = new StringBuffer();
		System.out.println("sb=" + sb);
		System.out.println(sb.capacity());// Ĭ��Ϊ16���ַ�
		System.out.println(sb.length());
		System.out.println("---------------");

		// public StringBuffer(int capacity)
		StringBuffer sb2 = new StringBuffer(50);
		System.out.println("sb=" + sb2);
		System.out.println(sb2.capacity());
		System.out.println(sb2.length());
		System.out.println("---------------");

		// public StringBuffer(String str)
		StringBuffer sb3 = new StringBuffer("hello");
		System.out.println("sb=" + sb3);
		System.out.println(sb3.capacity());
		System.out.println(sb3.length());
		System.out.println("---------------");
	}
}
