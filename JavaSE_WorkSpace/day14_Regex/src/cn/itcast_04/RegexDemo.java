package cn.itcast_04;

/*
 * �滻���ܣ�
 * 	public String replaceAll(String regex,String replacement)
 * 	replaceAll�滻���з���������ʽ�����ַ���
 */
public class RegexDemo {
	public static void main(String[] args) {
		String s = "hello11531534941kh239943892java";

		// ȥ����������
		String regex = "\\d";
		String ss = "*";
		String result = s.replaceAll(regex, ss);
		System.out.println(result);
	}
}
