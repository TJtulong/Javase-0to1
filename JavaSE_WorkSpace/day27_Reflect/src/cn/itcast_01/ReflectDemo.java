package cn.itcast_01;

/*
 * ��ȡclass�ļ�����ķ�ʽ
 * 1.Object���getClass()����
 * 2.�������͵ľ�̬����class
 * 3.Class���еľ�̬������
 * 			public static Class forName(String className)
 * 			��ȫ·��
 * �Լ��ã��ڶ��֣�����
 * �����������֣��ַ����������õ������ļ���
 */
public class ReflectDemo {
	public static void main(String[] args) throws ClassNotFoundException {
		//��ʽ1
		Person p = new Person();
		Class c = p.getClass();

		Person p2 = new Person();
		Class c2 = p2.getClass();

		System.out.println(p == p2);// false
		System.out.println(c == c2);// true
		
		//��ʽ2
		Class c3 = Person.class;
		
		//��ʽ3
		Class c4=Class.forName("cn.itcast_01.Person");
		System.out.println(c==c4);
	}
}
