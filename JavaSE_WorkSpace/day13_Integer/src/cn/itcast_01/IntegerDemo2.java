package cn.itcast_01;

/*
 * Integer���죺
 * 		public Integer(int value)
 * 		public Integer(String s)
 * 		ע�⣺�ַ��������������ַ����
 */
public class IntegerDemo2 {
	public static void main(String[] args) {
		int i = 100;
		Integer ii = new Integer(i);
		System.out.println("ii" + ii);

		String s = "100";
		//s="abc"; NumberFormatException
		Integer iii = new Integer(s);
		System.out.println("iii=" + iii);
	}

}
