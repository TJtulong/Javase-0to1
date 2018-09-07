package cn.itcast_03;

/*
 * JDK5的新特性：
 * 		自动装箱：把基本类型转换为包装类类型
 * 		自动拆箱：把包装类类型转换为基本类型
 */
public class IntegerTest {
	public static void main(String[] args) {
		Integer i = new Integer(100);
		Integer ii = 100;// JDK5新特性
		ii += 200;
		// 在使用时，Integer=Null;空指针报错
	}
}
