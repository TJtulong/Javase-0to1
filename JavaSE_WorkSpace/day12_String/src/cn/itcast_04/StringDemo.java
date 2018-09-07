package cn.itcast_04;
/*
 * String��ת������
 * 		byte[] getBytes():���ַ���ת��Ϊ�ֽ�����
 * 		char[] toCharArray():���ַ���ת��Ϊ�ַ�����
 * 		static String valueOf(char[] chs):���ַ�����ת���ַ���
 * 		static String valueOf(int i):��int��������ת���ַ���
 * 			valueOf���԰��������͵�����ת�����ַ���
 * 		String toLowerCase():���ַ���ת����Сд
 * 		String toUpperCase():���ַ���ת���ɴ�д
 * 		String concat(String str):���ַ���ƴ��
 */
public class StringDemo {
	public static void main(String[] args) {
		String s = "JavaSE";
		
		byte[] bys = s.getBytes();
		for(int x=0;x<bys.length;x++) {
			System.out.println(bys[x]);
		}
		System.out.println("-----------");
		
		char[] chs = s.toCharArray();
		for(int x=0;x<chs.length;x++) {
			System.out.println(chs[x]);
		}
		System.out.println("-----------");
		
		String ss=String.valueOf(chs);
		System.out.println(ss);
		System.out.println("-----------");
		
		int i =100;
		String sss= s.valueOf(i);
		System.out.println(sss);
		System.out.println("-----------");
		
		System.out.println(s.toLowerCase());
		System.out.println(s);//s������
		System.out.println("-----------");
		
		System.out.println(s.toUpperCase());
		System.out.println("-----------");
		
		String s1="hello";
		String s2="world";
		String s4=s1.concat(s2);
		System.out.println(s4);
	}
}
