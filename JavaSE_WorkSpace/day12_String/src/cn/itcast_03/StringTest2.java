package cn.itcast_03;

//ͳ��һ���ַ�����д�ַ���Сд�ַ��������ַ����ֵĴ���
public class StringTest2 {
	public static void main(String[] args) {
		String s = "Hello123World";
		int bigCount = 0;
		int smallCount = 0;
		int numCount = 0;

		for (int x = 0; x < s.length(); x++) {
			char ch = s.charAt(x);
			if (ch >= 'a' && ch <= 'z') {
				smallCount++;
			} else if (ch >= 'A' && ch <= 'Z') {
				bigCount++;
			} else {
				numCount++;
			}
		}
		System.out.println("��д��ĸ"+bigCount+"��");
		System.out.println("Сд��ĸ"+smallCount+"��");
		System.out.println("�����ַ�"+numCount+"��");
	}
}
