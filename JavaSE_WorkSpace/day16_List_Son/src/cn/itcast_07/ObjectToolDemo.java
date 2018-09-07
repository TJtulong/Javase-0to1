package cn.itcast_07;
/*
 * 	早期的时候。使用Object类代表任意类型
 * 	向上转型没问题，向下转型时存在类型转换的问题，不安全
 * 	Java在JDK5后引入泛型，提高程序安全性
 */
public class ObjectToolDemo {
	public static void main(String[] args) {
		//正常使用
		ObjectTool ot = new ObjectTool();
		ot.setObj(new Integer(27));
		Integer i =(Integer)ot.getObj();
		System.out.println("i="+i);
		
		ot.setObj(new String("王若潇"));
		String s=(String)ot.getObj();
		System.out.println("s="+s);
		System.out.println();
		
		/*ot.setObj(new Integer(27));
		String ss=(String)ot.getObj();
		System.out.println("s="+s);*/
		
	}
}
