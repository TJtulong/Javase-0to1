package cn.itcast_02;

/*
 * 	静态导入：import static 包名...类名.方法名
 * 		可直接导入方法的级别
 * 	注意事项：
 * 			1.方法是静态的
 * 			2.多个同名方法，必须加前缀
 */
import static java.lang.Math.abs;
import static java.lang.Math.pow;
import static java.lang.Math.max;

public class StaticImportDemo {
	public static void main(String[] args) {
		System.out.println(java.lang.Math.abs(-100));
		System.out.println(java.lang.Math.pow(2, 3));
		System.out.println(java.lang.Math.max(10, 20));

		// 太复杂，引入import
		System.out.println(Math.abs(-100));
		System.out.println(Math.pow(2, 3));
		System.out.println(Math.max(10, 20));

		//
		System.out.println(abs(-100));
		System.out.println(pow(2, 3));
		System.out.println(max(10, 20));

	}
}
