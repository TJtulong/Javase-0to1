package cn.itcast_03;
/*
 * 	�ָ��
 * 		String���public String[] split(String regex)
 * 		����������ʽ��ƥ���ִ��ַ���
 * 	����
 * 		��������
 * 			�Ա�Ů
 * 			��Χ��18-24
 */
public class RegexDemo {
	public static void main(String[] args) {
		String ages="18-24";
		
		String regex="-";
		
		String[] strArray=ages.split(regex);
		
		int startage=Integer.parseInt(strArray[0]);
		int endtage=Integer.parseInt(strArray[1]);
	}
}
