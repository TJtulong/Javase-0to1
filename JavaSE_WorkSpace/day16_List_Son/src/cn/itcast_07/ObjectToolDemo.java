package cn.itcast_07;
/*
 * 	���ڵ�ʱ��ʹ��Object�������������
 * 	����ת��û���⣬����ת��ʱ��������ת�������⣬����ȫ
 * 	Java��JDK5�����뷺�ͣ���߳���ȫ��
 */
public class ObjectToolDemo {
	public static void main(String[] args) {
		//����ʹ��
		ObjectTool ot = new ObjectTool();
		ot.setObj(new Integer(27));
		Integer i =(Integer)ot.getObj();
		System.out.println("i="+i);
		
		ot.setObj(new String("������"));
		String s=(String)ot.getObj();
		System.out.println("s="+s);
		System.out.println();
		
		/*ot.setObj(new Integer(27));
		String ss=(String)ot.getObj();
		System.out.println("s="+s);*/
		
	}
}
