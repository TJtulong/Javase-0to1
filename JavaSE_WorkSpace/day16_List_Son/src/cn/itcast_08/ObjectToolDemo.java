package cn.itcast_08;

/*
 *  ������Ĳ���
 */
public class ObjectToolDemo {
	public static void main(String[] args) {
		ObjectTool<String> ot = new ObjectTool<String>();

		ot.setObj(new String("������"));
		// String s = (String)ot.getObj();
		String s = ot.getObj();// ������Ҫǿת
		System.out.println("������:" + s);

		ObjectTool<Integer> ot2 = new ObjectTool<Integer>();
		ot2.setObj(new Integer(27));
		Integer i = (Integer) ot2.getObj();
		System.out.println("i=" + i);
	}
}
