package cn.itcast_07;

//String��StringBuffer���໥ת��
public class StringBufferTest {
	public static void main(String[] args) {
		String s = "hello";
		// ע�ⲻ�ܰ��ַ�����ֱֵ�Ӹ�ֵ��StringBuffer
		// StringBuffer sb="hello";
		// StringBuffer sb = s;

		// ת����ʽ1�����췽��
		StringBuffer sb = new StringBuffer(s);
		// ת����ʽ2��append
		StringBuffer sb2 = new StringBuffer();
		sb2.append(s);

		StringBuffer buffer = new StringBuffer("hello");
		// ��ʽ1�����췽��
		String s1 = new String(buffer);
		// ��ʽ2��toString()����
		String s2 = buffer.toString();
	}
}
