package cn.itcast_02;

/*
 * StringBuffer����ӹ���
 * 		public StringBuffer append(String str)
 * 		���԰�����������ӵ��ַ�����������,�������ַ�������������
 * 		public StringBuffer insert(int offset, String str)
 * 		��ָ��λ�ò����������͵�����
 */
public class StringBufferDemo {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		/*
		 * StringBuffer sb2=sb.append("hello"); System.out.println("sb="+sb);
		 * System.out.println("sb2="+sb2); System.out.println(sb==sb2);//true
		 */

		sb.append("hello");
		sb.append("sss");
		sb.append(3.55);
		// ��ʽ���
		sb.append("dd").append(3).append(444);
		System.out.println("sb=" + sb);
		
		sb.insert(5, "world");
		System.out.println("sb="+sb);
	}
}
