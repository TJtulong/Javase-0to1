package cn.itcast_01;
/*
 * 	����1����100�ֱ�ת��Ϊ�����ơ��˽��ơ�ʮ������
 * 	����2���ж�һ�������Ƿ���int��Χ��
 *  Ϊ�˶Ի����������ͽ��и��������java�Ͷ�ÿһ�ֻ��������ṩ�˶�Ӧ�İ�װ������
 *  byte	Byte
 *  short	Short
 *  int		Integer
 *  long	Long
 *  float	Float
 *  double	Double
 *  char	Charactor
 *  boolean	Boolean
 */
public class IntegerDemo {
	public static void main(String[] args) {
		//public static String toBinaryString(int i)
		System.out.println(Integer.toBinaryString(100));
		System.out.println(Integer.toOctalString(100));
		System.out.println(Integer.toHexString(100));
		
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
	}
}
