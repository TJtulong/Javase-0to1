package cn.itcast_02;

//int���ͺ�String���͵��໥ת��
public class IntegerDemo {
	public static void main(String[] args) {
		int number = 100;
		// int---String
		// ��ʽ1
		String s1 = "" + number;
		System.out.println("s1=" + s1);

		// ��ʽ2(�Ƽ�)
		String s2 = String.valueOf(number);
		System.out.println("s2=" + s2);

		// ��ʽ3
		Integer ii = new Integer(number);
		String s3 = ii.toString();
		System.out.println("s3=" + s3);

		// ��ʽ4
		String s4 = Integer.toString(number);
		System.out.println("s4=" + s4);

		// String---int
		String s = "100";
		// ��ʽ1
		Integer i1 = new Integer(s);
		int num = i1.intValue();
		System.out.println("i=" + num);
		// ��ʽ2
		int y = Integer.parseInt(s);
		System.out.println("i=" + y);

	}
}
