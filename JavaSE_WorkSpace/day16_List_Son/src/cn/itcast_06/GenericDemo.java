package cn.itcast_06;

/*
 * 	为避免出错，集合在创建对象的时候就明确元素的数据类型，这种技术为泛型
 * 	泛型：是一种把类型明确的工作推迟到建对象或调方法的时候才去明确的特殊类型
 * 		也被称为参数化类型，把类型像参数一样传递
 * 	格式：
 * 		<数据类型> 只能是引用类型
 * 	好处：	1.把运行时的问题提前到编译期间
 * 			2.避免了强制类型转换
 * 			3.优化了程序设计，解决了黄色警告线
 */
import java.util.ArrayList;
import java.util.Iterator;

public class GenericDemo {
	public static void main(String[] args) {
		// 创建集合对象
		ArrayList<String> array = new ArrayList<String>();

		// 添加元素
		array.add("hello");
		array.add("world");
		array.add("java");
		// array.add(10);//JDK5以后自动装箱
		// 等价于：array.add(Integer.valueOf(10))

		// 遍历
		Iterator<String> it = array.iterator();
		while (it.hasNext()) {
			// String s = (String) it.next();
			String s = it.next();
			System.out.println(s);
		}
	}
}
