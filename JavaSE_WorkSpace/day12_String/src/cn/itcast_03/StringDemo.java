package cn.itcast_03;

/*
 * String��Ļ�ȡ���ܣ�public����
 * 		int length():��ȡ�ַ����ĳ���
 * 		char charAt(int index):��ȡָ�����������ַ�
 * 		int indexOf(int ch):����ָ���ַ��ڴ��ַ����е�һ�γ��ִ�������
 * 			Ϊʲô��int��'a'��97�����Դ���a
 * 		int indexOf(String str):����ָ���ַ��ڴ��ַ����е�һ�γ��ִ�������
 * 		char charAt(int index,int fromIndex):����ָ���ַ��ڴ��ַ�����ָ��λ�ú��һ�γ��ִ�������
 * 		char charAt(String str,int fromIndex)
 * 		String substring(int start):��ָ��λ�ý�ȡ�ַ�����Ĭ�ϵ�ĩβ
 * 		String substring(int start��int end)
 */
public class StringDemo {
	public static void main(String[] args) {
		String s = "helloworld";

		// int length()
		System.out.println("s.length:" + s.length());

		// char charAt(int index)
		System.out.println("charat:" + s.charAt(7));

		// int indexOf(int ch)
		System.out.println("indexof:" + s.indexOf('l'));

		// int indexOf(String str)
		System.out.println("indexof:" + s.indexOf("owo"));

		// char charAt(int index,int fromIndex)
		System.out.println("indexof:" + s.indexOf('l', 4));
		System.out.println("indexof:" + s.indexOf('l', 40));// -1

		// String substring(int start) ����start�������
		System.out.println("substring:" + s.substring(5));// world

		// String substring(int start��int end)���󲻰���
		System.out.println("substring:" + s.substring(3, 8));// lowor

	}

}
