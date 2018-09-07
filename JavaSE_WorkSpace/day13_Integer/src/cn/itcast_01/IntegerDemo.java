package cn.itcast_01;
/*
 * 	需求1：把100分别转换为二进制、八进制、十六进制
 * 	需求2：判断一个数字是否是int范围内
 *  为了对基本数据类型进行更多操作，java就对每一种基本类型提供了对应的包装类类型
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
