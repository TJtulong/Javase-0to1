package cn.itcast_02;

import java.lang.reflect.Constructor;

/*
 * ͨ�������ȡ���ι��첢ʹ��
 */
public class ReflectDemo2 {
	public static void main(String[] args) throws Exception{
		Class c = Class.forName("cn.itcast_01.Person");
		
		//��ȡ���ι�����
		Constructor con = c.getConstructor(String.class,int.class,String.class);
		
		//��������
		Object obj = con.newInstance("Ҭ��Ƥ",22,"����");
		System.out.println(obj);
	}
}
