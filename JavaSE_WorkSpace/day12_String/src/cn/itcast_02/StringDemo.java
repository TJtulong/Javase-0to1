package cn.itcast_02;

/*
 * 	�жϹ��ܣ��Ǿ�̬������
 * 	boolean equals(object obj):�Ƚ��ַ����������Ƿ���ͬ
 * 	boolean equalsIgnoreCase(String str)���Ƚ��ַ����������Ƿ���ͬ�����Դ�Сд
 * 	boolean contains(String str):�жϴ��ַ������Ƿ����С�ַ���
 * 	boolean startsWith(String str):�ж��ַ����Ƿ���str��ͷ
 * 	boolean endsWith(String str):�ж��ַ����Ƿ���str��β
 * 	boolean isEmpty():�ж��ַ��������Ƿ�Ϊ��
 */
public class StringDemo {
	public static void main(String[] args) {
		String s1 = "helloworld";
		String s2 = "helloworld";
		String s3 = "Helloworld";

		// boolean equals(object obj)
		System.out.println("equals:" + s1.equals(s2));
		System.out.println("equals:" + s1.equals(s3));
		System.out.println("-------------------");

		// boolean equalsIgnoreCase(String str)
		System.out.println("equals:" + s1.equalsIgnoreCase(s2));
		System.out.println("equals:" + s1.equalsIgnoreCase(s3));
		System.out.println("-------------------");

		// boolean contains(String str)
		System.out.println("equals:" + s1.contains("hello"));// true
		System.out.println("equals:" + s1.contains("hw"));// false
		System.out.println("-------------------");

		// boolean startsWith(String str)
		System.out.println("startwith:" + s1.startsWith("h"));
		System.out.println("startwith:" + s1.startsWith("hello"));
		System.out.println("-------------------");

		// boolean isEmpty()
		System.out.println("isempty:" + s1.isEmpty());
		String s4 = "";
		System.out.println("isempty:" + s4.isEmpty());

	}
}
