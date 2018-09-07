package cn.itcast_08;

/*
 *  泛型类的测试
 */
public class ObjectToolDemo {
	public static void main(String[] args) {
		ObjectTool<String> ot = new ObjectTool<String>();

		ot.setObj(new String("王若潇"));
		// String s = (String)ot.getObj();
		String s = ot.getObj();// 不再需要强转
		System.out.println("姓名是:" + s);

		ObjectTool<Integer> ot2 = new ObjectTool<Integer>();
		ot2.setObj(new Integer(27));
		Integer i = (Integer) ot2.getObj();
		System.out.println("i=" + i);
	}
}
