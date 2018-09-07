package cn.itcast_01;

/*
 * 	�ַ����������ɶ���ַ���ɵ�һ�����ݣ�Ҳ���Կ�����һ���ַ�����
 * 	ͨ���鿴API��֪��
 * 		1.�ַ���ֵ"abc"���Կ�����һ���ַ�������
 * 		2.�ַ����ǳ�����һ������ֵ���Ͳ��ܱ��ı�
 * 	���췽����
 * 		public String ():�չ���
 * 		public String(byte[] bytes):���ֽ�����ת�����ַ���
 * 		public String(byte[] bytes,int index,int length):���ֽ�����һ����ת��Ϊ�ַ���
 * 		public String(char[] value):���ֽ�����ת�����ַ���
 * 		public String(char[] value,int index,int length):���ֽ�����һ����ת��Ϊ�ַ���
 * 		public String(String original):���ַ�������ֵת��Ϊ�ַ���
 * 	�ַ����ķ���:
 * 		public int length()�����ش��ַ����ĳ���
 */
public class StringDemo {
	public static void main(String[] args) {
		// public String ()
		String s1 = new String();
		System.out.println("s1=" + s1);
		System.out.println("s1.length()=" + s1.length());
		System.out.println("--------------------");

		// public String(byte[] bytes)
		byte[] bys = { 97, 98, 99, 100, 101 };
		String s2 = new String(bys);
		System.out.println("s2=" + s2);
		System.out.println("s2.length()=" + s2.length());
		System.out.println("--------------------");
		
		//public String(byte[] bytes,int index,int length)
		String s3 = new String(bys,1,3);
		System.out.println("s3=" + s3);
		System.out.println("s3.length()=" + s3.length());
		System.out.println("--------------------");
		
		//public String(char[] value)
		char[] chs = {'a','b','c','��','��','��'};
		String s4 = new String(chs);
		System.out.println("s4=" + s4);
		System.out.println("s4.length()=" + s4.length());
		System.out.println("--------------------");
		
		//public String(char[] value,int index,int length)
		String s5 = new String(chs,2,2);
		System.out.println("s5=" + s5);
		System.out.println("s5.length()=" + s5.length());
		System.out.println("--------------------");
		
		//public String(String original)
		String s6 = new String("abcdef");
		System.out.println("s6=" + s6);
		System.out.println("s6.length()=" + s6.length());
		System.out.println("--------------------");
		
		//�ַ�������ֵ"abcdef"Ҳ���Կ������ַ�������
		String s7 = "abcde";
		System.out.println("s7=" + s7);
		System.out.println("s7.length()=" + s7.length());
	}
}
