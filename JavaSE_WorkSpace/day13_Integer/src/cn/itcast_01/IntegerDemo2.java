package cn.itcast_01;

/*
 * Integer构造：
 * 		public Integer(int value)
 * 		public Integer(String s)
 * 		注意：字符串必须由数字字符组成
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
