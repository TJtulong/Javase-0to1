package cn.itcast_03;

/*
 * StringBuffer��ɾ������
 *		public StringBuffer deleteCharAt(int index)
 *		public StringBuffer delete(int start,int end)
 */
public class StringBufferDemo {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append("hello").append("world").append("java");
		System.out.println("sb=" + sb);

		sb.deleteCharAt(1);
		System.out.println("sb=" + sb);

		// ɾ��world
		sb.delete(5, 10);
		System.out.println("sb=" + sb);// ���󲻰���
		// ����ַ���������
		sb.delete(0, sb.length());
		System.out.println("sb=" + sb);
	}
}
